package ua.edu.ucu.apps.lab73.payments;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PayPalPayment implements Payment{
    double balance = 0;

    @Override
    public boolean pay(double price) {
        if (price <= this.balance){
            balance = this.balance - price;
        }
        return price <= this.balance;
    }
    @Override
    public void setBalance(double balance){
        this.balance = balance;
    }
}
