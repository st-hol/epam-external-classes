package ua.training.model.entity.handlers;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.training.model.entity.PreciousJewel;
import ua.training.model.entity.abstractions.Jewel;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CommonWeightTest {

    private static CommonWeight commonWeight;

    @BeforeClass
    public static void run(){
        ArrayList <Jewel> jewels = new ArrayList<>();
        jewels.add(new PreciousJewel("Almaz1", 1, 0,0));
        jewels.add(new PreciousJewel("Almaz2", 2, 0,0));
        jewels.add(new PreciousJewel("Almaz3", 3, 0,0));

        commonWeight = new CommonWeight(jewels);
    }

    @Test
    public void calculateCommonWeight() {
        int res = commonWeight.calculateCommonWeight();
        Assert.assertEquals(res, 6); //1+2+3
    }
}