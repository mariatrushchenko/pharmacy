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

@Table(name = "medicines")
public class Medicine {
    @Id
    private Long id;
    private String name;
    private String price;
    private String quantity;

    public Medicine(String name, String price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
