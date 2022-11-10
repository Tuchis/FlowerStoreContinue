package ua.edu.ucu.apps.lab73.item;

public abstract class Item {
    String description;

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice() {
        return 0;
    }
}
