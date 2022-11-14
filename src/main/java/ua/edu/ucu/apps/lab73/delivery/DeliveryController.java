package ua.edu.ucu.apps.lab73.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/api/v1/delivery")
@RestController
public class DeliveryController {
    @GetMapping
    public List<? extends Delivery> getdeliverys() {
        Delivery delivery = new DHLDeliveryStrategy();
        Delivery delivery1 = new PostDeliveryStrategy();
        return List.of(delivery, delivery1);
    }
}
