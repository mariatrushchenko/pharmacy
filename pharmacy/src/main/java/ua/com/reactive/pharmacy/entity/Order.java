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
    @Column("customer_id")
    private Long customer_id;
    @Column("medicine_id")
    private Long medicine_id;
    private LocalDate date;

    public Order(Long customer_id, Long medicine_id, LocalDate date) {
        this.customer_id = customer_id;
        this.medicine_id = medicine_id;
        this.date = date;
    }
}
