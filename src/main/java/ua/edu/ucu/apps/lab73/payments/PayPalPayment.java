package ua.edu.ucu.apps.lab73.payments;

import lombok.Setter;

@Setter
public class PayPalPayment implements Payment{
    double balance = 0;

    @Override
    public boolean pay(double price) {
        if (price <= this.balance){
            balance = this.balance - price;
        }
        return price <= this.balance;
    }
}
