package ua.com.reactive.pharmacy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.pharmacy.entity.Order;

@RestController
public class OrderController {
    @GetMapping("/orders")

    public Flux<Order> getOrders() {
        Flux<Order> orders = Flux.just(
                        new Order(1L, 1L, 1L, "2024-11-20"),
                        new Order(2L, 2L, 2L, "2024-11-21")
                )
                .skip(0)
                .take(2);

        return orders;
    }
}
