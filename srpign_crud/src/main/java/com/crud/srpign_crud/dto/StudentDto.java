package com.crud.srpign_crud.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentDto {
    @NotBlank(message = "ID is required")
    private String id;
    @NotBlank(message = "First Name Is Mandatory")
    private String fristName;
    private String lastName;
    @Email(message = "Must be Valid")
    private String email;
    @Size(min =5, message = "Password Must be Greater Than 5")
    private String password;
}
