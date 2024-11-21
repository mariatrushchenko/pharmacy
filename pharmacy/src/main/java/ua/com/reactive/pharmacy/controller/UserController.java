package ua.com.reactive.pharmacy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.User;
import ua.com.reactive.pharmacy.service.UserService;

@RestController

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public Mono<User> registerUser(@RequestBody User user) {
        return userService.save(user);
    }
}
