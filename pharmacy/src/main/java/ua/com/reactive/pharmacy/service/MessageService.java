package ua.com.reactive.pharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Message;
import ua.com.reactive.pharmacy.repository.MessageRepository;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Flux<Message> list() {
        return messageRepository.findAll();
    }

    public Mono<Message> addOne(Message message) {
        return messageRepository.save(message);
    }
}
