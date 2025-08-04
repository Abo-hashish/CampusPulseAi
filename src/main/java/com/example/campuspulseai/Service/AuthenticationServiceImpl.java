package com.example.campuspulseai.Service;

import com.example.campuspulseai.DTO.Request.AuthenticationRequest;
import com.example.campuspulseai.DTO.Request.RegisterRequest;
import com.example.campuspulseai.DTO.Response.AuthenticationResponse;
import com.example.campuspulseai.Repository.IUserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AuthenticationServiceImpl implements IAuthenticationService {

    //private final IUserRepository userRepository;

    public void register(RegisterRequest input) throws Exception {}

    public AuthenticationResponse login(AuthenticationRequest request) { return null;}

}
