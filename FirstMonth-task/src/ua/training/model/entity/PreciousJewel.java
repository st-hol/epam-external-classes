package ua.training.model.entity;

import ua.training.model.entity.abstractions.Jewel;

public class PreciousJewel extends Jewel {

    public PreciousJewel(String name, int weight, long price, double transparency) {
        super(name, weight, price, transparency);
    }

    @Override
    public String toString() {
        return "PreciousJewel" + super.toString();
    }
}
