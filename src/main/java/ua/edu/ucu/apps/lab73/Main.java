package ua.edu.ucu.apps.lab73;

import ua.edu.ucu.apps.lab73.item.Item;
import ua.edu.ucu.apps.lab73.order.Order;
import ua.edu.ucu.apps.lab73.store.Flower;
import ua.edu.ucu.apps.lab73.store.FlowerBucket;
import ua.edu.ucu.apps.lab73.store.FlowerColor;
import ua.edu.ucu.apps.lab73.store.FlowerPack;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        ua.edu.ucu.apps.lab73.store.Flower flower = new Flower(FlowerColor.BLUE, 100, 200);
        FlowerPack pack = new FlowerPack(flower, 20);
        Item item = new FlowerBucket();
        ((FlowerBucket) item).add(pack);
        order.addItem(item);
        System.out.println(order.calculateTotalPrice());
        order.removeItem(item);
        System.out.println(order.calculateTotalPrice());
    }
}
