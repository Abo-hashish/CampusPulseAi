package com.example.campuspulseai.Service.Impl;

import com.example.campuspulseai.DTO.Request.AuthenticationRequest;
import com.example.campuspulseai.DTO.Request.RegisterRequest;
import com.example.campuspulseai.DTO.Response.AuthenticationResponse;
import com.example.campuspulseai.Service.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AuthenticationServiceImpl implements IAuthenticationService {

    //private final IUserRepository userRepository;

    public void register(RegisterRequest input) throws Exception {}

    public AuthenticationResponse login(AuthenticationRequest request) { return null;}

}
