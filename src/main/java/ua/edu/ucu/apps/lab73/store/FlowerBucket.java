package ua.edu.ucu.apps.lab73.store;

import ua.edu.ucu.apps.lab73.item.Item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    /**
     * FlowerPacks.
     */
    private List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    /**
     * Add flower packs.
     *
     * @param flowerPack
     */
    public void add(final FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    /**
     * Getprice.
     *
     * @return int
     */
    @Override
    public double getPrice() {
        double price = 0;
        for (FlowerPack pack : flowerPacks) {
            price += pack.getPrice();
        }
        return price;
    }

    /**
     * Check if desirable pack or not.
     *
     * @param flowerSpec
     * @return boolean
     */
    public boolean isDesirable(final FlowerSpec flowerSpec) {
        boolean flagType = false;
        for (FlowerPack pack : flowerPacks) {
            if (flowerSpec.getFlowersTypes().contains(pack.getType())) {
                flagType = true;
            }
        }
        if (!flagType) {
            return false;
        }
        boolean flagColor = false;
        for (FlowerPack pack : flowerPacks) {
            System.out.println(flowerSpec.getColor());
            System.out.println(pack.getColor());
            if (flowerSpec.getColor().equals(pack.getColor())) {
                flagColor = true;
            }
        }
        if (!flagColor) {
            return false;
        }
        int amount = 0;
        for (FlowerPack pack : flowerPacks) {
            amount += pack.getAmount();
        }
        return flowerSpec.getAmount() == amount;
    }
}
