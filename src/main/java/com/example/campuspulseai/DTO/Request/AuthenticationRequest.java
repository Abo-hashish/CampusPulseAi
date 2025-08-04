package com.example.campuspulseai.DTO.Request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class AuthenticationRequest {

    private String email;
    private String password;
}
