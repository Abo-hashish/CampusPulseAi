package com.example.campuspulseai.DTO.Response;

import java.util.List;

public class CreateClubResponse {
    private long clubId;
    private String name;
    private String description;
    private String logoUrl;
    private boolean isActive;
    private List<GetEventResponse> events;
}
