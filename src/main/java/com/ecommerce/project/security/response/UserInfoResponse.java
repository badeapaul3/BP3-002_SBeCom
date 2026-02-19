package com.ecommerce.project.security.response;


import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoResponse {
    @Getter
    @Setter
    private Long id;
    private String username;
    private List<String> roles;
    private String jwtToken;

    public UserInfoResponse(Long id, String username, List<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }
}
