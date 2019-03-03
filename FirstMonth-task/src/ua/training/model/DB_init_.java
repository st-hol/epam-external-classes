package ua.training.model;


import ua.training.model.entity.PreciousJewel;
import ua.training.model.entity.SemiPreciousJewel;


/**
 * Just a DataBase imitation.
 */
public enum DB_init_ {
    //will be precious
    GEM1("Ruby", 31, 14_444, 0.3),
    GEM2("Amethyst", 10, 22_222, 0.2),

    //will be semiprecious
    GEM3("Aquamarine", 13, 3_333, 0.8),
    GEM4("Topaz", 15, 1_111, 0.5),
    GEM5("Amber", 23, 5_555, 0.6);

    public String name;
    public int weight;
    public long price;
    public double transparency;

    DB_init_(String name, int weight, long price, double transparency) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
    }


    public static PreciousJewel obtainPreciousJewel(DB_init_ item){
        return new PreciousJewel(item.name, item.weight, item.price, item.transparency);
    }

    public static SemiPreciousJewel obtainSemiPreciousJewel(DB_init_ item){
        return new SemiPreciousJewel(item.name, item.weight, item.price, item.transparency);
    }
}

