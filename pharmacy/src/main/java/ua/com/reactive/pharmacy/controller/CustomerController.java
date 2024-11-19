package ua.com.reactive.pharmacy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.pharmacy.entity.Customer;

@RestController
public class CustomerController {
    @GetMapping("/customers")

    public Flux<Customer> getCustomers() {
        Flux<Customer> customers = Flux.just(
                        new Customer(1L, "Alice", "Smith", "+3800959205720", "1111", "1111"),
                        new Customer(2L, "Bob", "Johnson", "+380689304829", "2222", "2222")
                )
                .skip(0)
                .take(2);

        return customers;
    }
}
