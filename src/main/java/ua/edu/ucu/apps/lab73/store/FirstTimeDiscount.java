package ua.edu.ucu.apps.lab73.store;

import ua.edu.ucu.apps.lab73.item.Item;

public class FirstTimeDiscount extends Item {
    private Item item;
    public FirstTimeDiscount(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() * 0.75;
    }
}
