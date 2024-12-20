package ua.com.reactive.pharmacy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.pharmacy.entity.Medicine;
import ua.com.reactive.pharmacy.service.MedicineService;

@RestController
@RequestMapping("/medicines")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class MedicineController {
    private final MedicineService medicineService;

    @GetMapping
    public Flux<Medicine> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return medicineService.list();
    }

    @PostMapping
    public Mono<Medicine> create(@RequestBody Medicine medicine) {
        return medicineService.addOne(medicine);
    }

}
