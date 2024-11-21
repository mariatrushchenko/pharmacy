package ua.com.reactive.pharmacy.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.User;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Long>{
    @Query("SELECT id, username, password FROM users WHERE username = :username")
    Mono<User> findByUsername(String username);
}
