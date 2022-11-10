package ua.edu.ucu.apps.lab73.store;

public class FlowerPack {
    /**
     * FLowerPack class.
     */
    private Flower flower;
    /**
     * Amount.
     */
    private int amount;

    /**
     * FlowerPack init.
     *
     * @param flowerer
     * @param quantity
     */
    public FlowerPack(final Flower flowerer, final int quantity) {
        this.flower = flowerer;
        this.amount = quantity;
    }

    /**
     * Gettype.
     *
     * @return String
     */
    public String getType() {
        return this.flower.getClass().getSimpleName();
    }

    /**
     * Getprice.
     *
     * @return int
     */
    public double getPrice() {
        return this.amount * this.flower.getPrice();
    }

    /**
     * Getcolor.
     *
     * @return String
     */
    public String getColor() {
        return this.flower.getColor();
    }

    /**
     * Getamount.
     *
     * @return int
     */
    public int getAmount() {
        return this.amount;
    }
}
