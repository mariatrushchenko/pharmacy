package ua.com.reactive.pharmacy.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "orders")
public class Order {
    @Id
    private Long id;
    @Column("user_id")
    private Long user_id;
    @Column("medicine_id")
    private Long medicine_id;
    private LocalDate date;

    public Order(Long user_id, Long medicine_id, LocalDate date) {
        this.user_id = user_id;
        this.medicine_id = medicine_id;
        this.date = date;
    }
}
