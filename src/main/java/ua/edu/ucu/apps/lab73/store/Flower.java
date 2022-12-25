package ua.edu.ucu.apps.lab73.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.lab73.item.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;

@Getter
@Setter
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Flower extends Item {
    @Id @GeneratedValue
    private int id ;
    private String color;
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
//    public Flower(String color, int sepalLength, double price){
//        this.color = color;
//        this.sepalLength = sepalLength;
//        this.price = price;
//    }

//    public Flower() {
//
//    }

//    public String getColor() {
//        return this.color;
//    }
}

