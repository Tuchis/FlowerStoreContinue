package ua.edu.ucu.apps.lab73.payments;

public interface Payment {
    double price = 0;

    boolean pay(double price);
}
