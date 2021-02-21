package com.example.demo.registration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class registrationRequest  {
    private final String fistName;
    private final String lastName;
    private final String email;
    private final String password;
}
