package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.dto;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private String currentPassword;
    private String newPassword;
}
