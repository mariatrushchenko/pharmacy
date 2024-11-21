package ua.com.reactive.pharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Order;
import ua.com.reactive.pharmacy.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Flux<Order> list() {
        return orderRepository.findAll();
    }

    public Mono<Order> addOne(Order order) {
        return orderRepository.save(order);
    }

}
