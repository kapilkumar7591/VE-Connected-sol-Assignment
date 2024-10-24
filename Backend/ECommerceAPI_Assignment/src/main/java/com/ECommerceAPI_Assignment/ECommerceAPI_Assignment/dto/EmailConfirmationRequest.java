package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.dto;

import lombok.Data;

@Data
public class EmailConfirmationRequest {
    private String email;
    private String confirmationCode;
}
