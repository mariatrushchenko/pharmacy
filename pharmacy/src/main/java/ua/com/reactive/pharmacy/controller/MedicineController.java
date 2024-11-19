package ua.com.reactive.pharmacy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.pharmacy.entity.Medicine;

@RestController
public class MedicineController {
    @GetMapping("/medicines")

    public Flux<Medicine> getMedicines() {
        Flux<Medicine> medicines = Flux.just(
                        new Medicine(1L, "Paracetamol", "50", "219"),
                        new Medicine(2L, "Ibuprofen", "100", "498")
                )
                .skip(0)
                .take(2);

        return medicines;
    }
}
