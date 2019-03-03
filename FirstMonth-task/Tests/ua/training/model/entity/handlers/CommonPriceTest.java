package ua.training.model.entity.handlers;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.training.model.entity.PreciousJewel;
import ua.training.model.entity.abstractions.Jewel;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CommonPriceTest {

    private static CommonPrice commonPrice;

    @BeforeClass
    public static void run(){
        ArrayList <Jewel> jewels = new ArrayList<>();
        jewels.add(new PreciousJewel("Almaz1", 0, 100,0));
        jewels.add(new PreciousJewel("Almaz2", 0, 200,0));
        jewels.add(new PreciousJewel("Almaz3", 0, 300,0));

        commonPrice = new CommonPrice(jewels);
    }

    @Test
    public void calculateCommonWeight() {
        long res = commonPrice.calculateCommonPrice();
        Assert.assertEquals(res, 600L); //100+200+300
    }
}