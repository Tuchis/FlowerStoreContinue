package ua.edu.ucu.apps.lab73.delivery;

import ua.edu.ucu.apps.lab73.item.Item;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver(LinkedList<Item> items){
        double price = 0;
        for (Item item:items){
            price += item.getPrice();
        }
        System.out.println("Price of delivery is " + price * 1.05);
    }
}
