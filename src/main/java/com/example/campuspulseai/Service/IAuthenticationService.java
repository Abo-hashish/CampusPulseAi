package com.example.campuspulseai.Service;

import com.example.campuspulseai.DTO.Request.AuthenticationRequest;
import com.example.campuspulseai.DTO.Request.RegisterRequest;
import com.example.campuspulseai.DTO.Response.AuthenticationResponse;

public interface IAuthenticationService {

    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
