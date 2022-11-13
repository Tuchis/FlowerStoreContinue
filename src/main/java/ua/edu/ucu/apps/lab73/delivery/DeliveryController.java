package ua.edu.ucu.apps.lab73.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/delivery")
@RestController
public class DeliveryController {
    @GetMapping
    public List<? extends Delivery> getdeliverys() {
        return List.of(new DHLDeliveryStrategy());
    }
}
