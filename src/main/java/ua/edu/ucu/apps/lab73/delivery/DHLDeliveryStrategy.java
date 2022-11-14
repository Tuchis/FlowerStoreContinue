package ua.edu.ucu.apps.lab73.delivery;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab73.item.Item;

import java.util.LinkedList;
@Setter @Getter
public class DHLDeliveryStrategy implements Delivery{
    private String name = "DHL DELIVERY";
    @Override
    public void deliver(LinkedList<Item> items){
        double price = 0;
        for (Item item:items){
            price += item.getPrice();
        }
        System.out.println("Price of delivery is " + price * 1.05);
    }
}
