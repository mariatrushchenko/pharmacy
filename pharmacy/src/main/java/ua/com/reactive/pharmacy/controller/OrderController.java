package ua.com.reactive.pharmacy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Order;
import ua.com.reactive.pharmacy.service.OrderService;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public Flux<Order> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return orderService.list();
    }

    @PostMapping
    public Mono<Order> create(@RequestBody Order order) {
        return orderService.addOne(order);
    }
}
