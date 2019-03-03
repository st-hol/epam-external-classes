package ua.training.model.entity;

import ua.training.model.entity.abstractions.Jewel;

public class SemiPreciousJewel extends Jewel {

    public SemiPreciousJewel(String name, int weight, long price, double transparency) {
        super(name, weight, price, transparency);
    }

    @Override
    public String toString() {
        return "SemiPreciousJewel" + super.toString();
    }

}
