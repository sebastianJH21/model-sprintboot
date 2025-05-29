package com.app.auth.adapters;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.app.auth.infrastructure.dto.*;
import com.app.auth.application.AuthService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

// @CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(AuthController.BASE_URL)
@RequiredArgsConstructor
@Tag(name = "Authentication", description = "API for authentication and user management")
public class AuthController {

    public static final String BASE_URL = "/api/auth";

    private final AuthService authService;

    @PostMapping("/login")
    @Operation(summary = "Login", description = "Authenticates a user and returns a JWT token")
    public ResponseEntity<ApiResponse<AuthResponse>> login(@Valid @RequestBody LoginRequest request) {
        AuthResponse response = authService.login(request.getUserName(), request.getPassword());
        return ResponseEntity.ok(new ApiResponse<>(true, "Login successfull", response));
    }

    @PostMapping("/register")
    @Operation(summary = "Register user", description = "Registers a new user and returns a JWT token")
    public ResponseEntity<ApiResponse<AuthResponse>> register(@Valid @RequestBody RegisterRequest request) {
        AuthResponse response = authService.register(request);
        return ResponseEntity.ok(new ApiResponse<>(true, "Register successfull", response));
    }

    @PostMapping("/refresh")
    @Operation(summary = "Refresh token", description = "Generate a new JWT token using a refresh token")
    public ResponseEntity<ApiResponse<AuthResponse>> refresh(@RequestBody RefreshTokenRequest request) {
        AuthResponse response = authService.refreshToken(request.getRefreshToken());
        return ResponseEntity.ok(new ApiResponse<>(true, "Refresh successfull", response));
    }

    @GetMapping("/profile")
    @Operation(summary = "Get profile", description = "Gets the profile of the authenticated user")
    public ResponseEntity<ApiResponse<ProfileResponse>> getUserProfile(Authentication authentication) {
        ProfileResponse response = authService.getProfile(authentication.getName());
        return ResponseEntity.ok(new ApiResponse<>(true, "Get profile successfull", response));
    }
}