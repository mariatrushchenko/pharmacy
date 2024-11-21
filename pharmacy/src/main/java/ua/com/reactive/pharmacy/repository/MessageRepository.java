package ua.com.reactive.pharmacy.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.reactive.pharmacy.entity.Message;

@Repository
public interface MessageRepository extends ReactiveCrudRepository<Message, Long>{
}
