package ua.com.reactive.pharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Customer;
import ua.com.reactive.pharmacy.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Flux<Customer> list() {
        return customerRepository.findAll();
    }

    public Mono<Customer> addOne(Customer customer) {
        return customerRepository.save(customer);
    }
}
