package com.bharath.backendrestapiemp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}