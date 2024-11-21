package ua.com.reactive.pharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Medicine;
import ua.com.reactive.pharmacy.repository.MedicineRepository;

@Service
public class MedicineService {

    private final MedicineRepository medicineRepository;

    @Autowired
    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    public Flux<Medicine> list() {
        return medicineRepository.findAll();
    }

    public Mono<Medicine> addOne(Medicine medicine) {
        return medicineRepository.save(medicine);
    }
}
