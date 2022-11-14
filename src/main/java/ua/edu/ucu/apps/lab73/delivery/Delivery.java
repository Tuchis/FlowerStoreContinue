package ua.edu.ucu.apps.lab73.delivery;

import ua.edu.ucu.apps.lab73.item.Item;

import java.util.LinkedList;

public interface Delivery {
    String name = "";
    public void deliver(LinkedList<Item> items);
}
