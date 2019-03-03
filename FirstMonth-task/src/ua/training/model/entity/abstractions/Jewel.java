package ua.training.model.entity.abstractions;

public abstract class Jewel{

    private String name;
    private int weight;
    private long price;
    private double transparency;

    public Jewel(String name, int weight, long price, double transparency) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
    }


    public int getWeight() {
        return weight;
    }

    public long getPrice() {
        return price;
    }

    public double getTransparency() {
        return transparency;
    }


    @Override
    public String toString() {
        return  " {\nname = '" + getName() + "'," +
                " weight = '" + getWeight() + "'," +
                " price = '" + getPrice() + "'," +
                " transparency = '" + getTransparency() + "'\n}";
    }

    public String getName() {
        return name;
    }
}




