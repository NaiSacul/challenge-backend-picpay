package com.naisacul.challengebackendpicpay.dtos;

import com.naisacul.challengebackendpicpay.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email,
                      String password, UserType userType) {
}
