package ua.edu.ucu.apps.lab73.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/api/v1/payments")
@RestController
public class PaymentController {
    @GetMapping
    public List<? extends Payment> getPayments() {
        Payment payment1 = new PayPalPayment();
        payment1.setBalance(15);
        Payment payment2 = new CreditCardPaymentStrategy();
        payment2.setBalance(20);
        return List.of(payment1, payment2);
//        return List.of();
    }
}
