package ua.com.reactive.pharmacy.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "roles_has_users")
public class RolesHasUsers {

    @Id
    private Long id;
    @Column("role_id")
    private Long role_id;
    @Column("user_id")
    private Long user_id;

}