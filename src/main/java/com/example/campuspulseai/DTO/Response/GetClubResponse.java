package com.example.campuspulseai.DTO.Response;
import lombok.*;

import java.util.List;

@Data
@RequiredArgsConstructor
@Getter
@Setter
public class GetClubResponse {

        // Core Club Information
        private long clubId;
        private String name;
        private String description;
        private String logoUrl;
        private boolean isActive;
        private OrganizerResponse organizerResponse;
        private List<GetEventResponse> events;
}
