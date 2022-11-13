package ua.edu.ucu.apps.lab73.order;

import ua.edu.ucu.apps.lab73.delivery.Delivery;
import ua.edu.ucu.apps.lab73.item.Item;
import ua.edu.ucu.apps.lab73.payments.Payment;

import java.util.LinkedList;

public class Order {
    LinkedList<Item> items = new LinkedList<Item>();
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public void processOrder(){
        this.delivery.deliver(this.items);
        this.payment.pay(this.calculateTotalPrice());
        System.out.println("You have " + this.items.size() + " items and price is " + this.calculateTotalPrice());
    }
    public double calculateTotalPrice(){
        double price = 0;
        for (Item item:this.items){
            price += item.getPrice();
        }
        return price;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
}
