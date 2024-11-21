package ua.com.reactive.pharmacy.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Customer;
import ua.com.reactive.pharmacy.entity.Greeting;

@Component
public class GreetingHandler {
    public Mono<ServerResponse> hello(ServerRequest request) {

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(new Greeting("Hello, Spring")));
    }

    public Mono<ServerResponse> home(ServerRequest request) {
        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("Main page!"));
    }

    public Mono<ServerResponse> getUsers(ServerRequest request) {

        String start = request
                .queryParam("start")
                .orElse("0");


        Flux<Customer> customers = Flux.just(
                new Customer(1L, "Alice", "Smith", "+3800959205720", "1111", "1111"),
                new Customer(2L, "Bob", "Johnson", "+380689304829", "2222", "2222")
        )
                .skip(Long.valueOf(start))
                .take(2);

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(customers, Customer.class);
    }
}
