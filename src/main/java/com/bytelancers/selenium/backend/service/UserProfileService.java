package com.bytelancers.selenium.backend.service;

import com.bytelancers.selenium.backend.model.UserProfileResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserProfileService {

    public UserProfileResponse getUserProfile() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/user_info.json");
            if (inputStream == null) {
                throw new FileNotFoundException("Resource not found: /data/user_info.json");
            }
            return objectMapper.readValue(inputStream, UserProfileResponse.class);

        } catch (Exception e) {
            log.error("Error occurred while reading user profile", e);
        }
        return new UserProfileResponse();

    }
}
