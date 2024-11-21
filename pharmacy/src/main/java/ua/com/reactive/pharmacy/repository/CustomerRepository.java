package ua.com.reactive.pharmacy.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.reactive.pharmacy.entity.Customer;

@Repository
public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long>{
}
