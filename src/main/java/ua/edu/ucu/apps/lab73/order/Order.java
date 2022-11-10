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
        System.out.println("Your items are " + this.items.toString() + "and price is " + this.calculateTotalPrice());
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
