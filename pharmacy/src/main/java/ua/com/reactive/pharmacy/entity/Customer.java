package ua.com.reactive.pharmacy.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "customers")
public class Customer {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String username;
    private String password;

    public Customer(String firstname, String lastname, String phone, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }
}
