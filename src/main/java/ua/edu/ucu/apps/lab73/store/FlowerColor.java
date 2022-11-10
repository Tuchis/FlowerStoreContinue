package ua.edu.ucu.apps.lab73.store;

public enum FlowerColor {
    /**
     * Red color.
     */
    RED("#FF0000"),
    /**
     * Green color.
     */
    GREEN("#00FF00"),
    /**
     * Blue color.
     */
    BLUE("#0000FF");
    /**
     * Color.
     */
    private String color;

    /**
     * Init of FlowerColor.
     *
     * @param colorer
     */
    FlowerColor(final String colorer) {
        this.color = colorer;
    }

    /**
     * Get color.
     *
     * @return String
     */
    public String getColor() {
        return this.color;
    }
}
