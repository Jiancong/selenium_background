package com.bytelancers.selenium.backend.controller;

import com.bytelancers.selenium.backend.model.request.UserProfileRequest;
import com.bytelancers.selenium.backend.model.response.UserProfileResponse;
import com.bytelancers.selenium.backend.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping()
    public ResponseEntity<Void> postUserProfile(@RequestBody UserProfileRequest request) {
        userProfileService.postUserProfile(request);
        return ResponseEntity.ok().build();
    }
}
