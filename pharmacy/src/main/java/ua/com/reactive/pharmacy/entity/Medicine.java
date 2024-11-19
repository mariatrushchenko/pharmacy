package ua.com.reactive.pharmacy.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Medicine {
    private Long id;
    private String name;
    private String price;
    private String quantity;
}
