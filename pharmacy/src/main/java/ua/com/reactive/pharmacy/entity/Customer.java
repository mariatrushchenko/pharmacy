package ua.com.reactive.pharmacy.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String username;
    private String password;
}
