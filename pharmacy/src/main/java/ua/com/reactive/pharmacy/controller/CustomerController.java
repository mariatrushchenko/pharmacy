package ua.com.reactive.pharmacy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Customer;
import ua.com.reactive.pharmacy.service.CustomerService;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public Flux<Customer> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return customerService.list();
    }

    @PostMapping
    public Mono<Customer> create(@RequestBody Customer customer) {
        return customerService.addOne(customer);
    }
}
