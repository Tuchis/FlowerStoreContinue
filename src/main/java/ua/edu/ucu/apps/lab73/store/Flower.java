package ua.edu.ucu.apps.lab73.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab73.item.Item;

@Getter
@Setter
@AllArgsConstructor
public class Flower extends Item {
    private FlowerColor color;
    /**
     * Flower class.
     */
    /**
     * Price and sepallength.
     */
    private int sepalLength;
    private double price;
    /**
     * Color of flower.
     */

    /**
     * Getcolor.
     *
     * @return String
     */
    public String getColor() {
        return color.getColor();
    }
}

