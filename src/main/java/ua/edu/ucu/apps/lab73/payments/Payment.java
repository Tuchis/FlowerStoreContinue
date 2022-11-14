package ua.edu.ucu.apps.lab73.payments;

import lombok.Getter;
import lombok.Setter;

public interface Payment {
    double balance = 0;

    boolean pay(double price);

    void setBalance(double balance);
}
