package ua.com.reactive.pharmacy.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private Long id;
    private Long customer_id;
    private Long medicine_id;
    private String date;
}
