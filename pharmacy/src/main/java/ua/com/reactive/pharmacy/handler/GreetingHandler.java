package ua.com.reactive.pharmacy.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.User;
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

    public Mono<ServerResponse> users(ServerRequest request){
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue("User Page"));
    }

    public Mono<ServerResponse> admin(ServerRequest request) {

        Flux<User> users = Flux.
                just(
                        new User("Alice", "Smith", "+3800959205720", "1111", "1111"),
                        new User("Bob", "Johnson", "+380689304829", "2222", "2222")
                );

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(users, User.class);
    }
    public Mono<ServerResponse> registration (ServerRequest request) {
        return ServerResponse.ok().render("registration");
    }
}
