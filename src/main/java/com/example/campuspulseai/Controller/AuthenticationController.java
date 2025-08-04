package com.example.campuspulseai.Controller;

import com.example.campuspulseai.DTO.Request.AuthenticationRequest;
import com.example.campuspulseai.DTO.Request.RegisterRequest;
import com.example.campuspulseai.DTO.Response.AuthenticationResponse;
import com.example.campuspulseai.Service.IAuthenticationService;
import lombok.AllArgsConstructor;
import lombok.Data;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final IAuthenticationService authenticationService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/register")
    public void register(RegisterRequest registerRequest) throws Exception {
        authenticationService.register(registerRequest);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(AuthenticationRequest authRequest) {
    return null;}

}
