package com.bytelancers.selenium.backend.controller;

import com.bytelancers.selenium.backend.model.UserProfileResponse;
import com.bytelancers.selenium.backend.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/userprofile")
public class UserProfileController {

    private final UserProfileService userProfileService;

    @GetMapping()
    public ResponseEntity<UserProfileResponse> getUserProfile() {
        UserProfileResponse userProfileResponse = userProfileService.getUserProfile();
        return new ResponseEntity<>(userProfileResponse, HttpStatus.OK);
    }
}
