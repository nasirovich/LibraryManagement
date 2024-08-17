package com.example.demo.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsersDto {
    private String name;
    private String surname;
    private String username;
    private String email;
}
