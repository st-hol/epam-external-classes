package ua.training.model;

import org.junit.*;
import ua.training.model.entity.PreciousJewel;
import ua.training.model.entity.abstractions.CommonCharacteristic;
import ua.training.model.entity.abstractions.Jewel;
import ua.training.model.entity.handlers.CommonPrice;
import ua.training.model.entity.handlers.CommonWeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static ua.training.model.DB_init_.*;

public class JewelNecklaceModelTest {

    private static  JewelNecklaceModel jewelNecklaceModel;

    @BeforeClass
    public static void run(){
        jewelNecklaceModel = new JewelNecklaceModel();

        for ( DB_init_ item: DB_init_.values()) {
            jewelNecklaceModel.addJewelToNecklace(obtainPreciousJewel(item));
        }
    }


    @Test
    public void sortJewels() {
        TreeSet<Jewel> jewelsTreeSet = jewelNecklaceModel.sortJewels();

        Jewel currentJewel = jewelsTreeSet.first();
        for(Jewel jewel : jewelsTreeSet){
            //перевіряємо ціну на властивість неспадання
            if ( ! (currentJewel.getPrice() <= jewel.getPrice())){
                Assert.fail();
            }
            currentJewel = jewel;
        }
    }

    @Test
    public void searchJewelsInTransparencyRange() {

        //додаємо камінь з прозорістю 0.12345
        jewelNecklaceModel.addJewelToNecklace(
                new PreciousJewel("Almaz",12, 10000, 0.12345 ));

        //шукаємо камені з прозорістю від 0.12345 до 0.12345
        Stream<Jewel> jewelStream = jewelNecklaceModel
                .searchJewelsInTransparencyRange(0.12345, 0.12345);

        Optional<Jewel> expectedAlmaz = jewelStream.findAny();

        if(expectedAlmaz.isPresent()){
            if ( ! expectedAlmaz.get().getName().equals("Almaz")){
                Assert.fail();
            }
        }

    }


    //be careful (this test is very stupid)
    @Test
    public void getCharacteristics() {
       List<CommonCharacteristic>  characteristics = jewelNecklaceModel.getCharacteristics();

       boolean isCommonWeightClass = characteristics.get(0).getClass().isInstance(new CommonWeight(new ArrayList<>()));
       boolean isCommonPriceClass = characteristics.get(1).getClass().isInstance(new CommonPrice(new ArrayList<>()));

       if ( ! (isCommonPriceClass && isCommonWeightClass)){
           Assert.fail();
       }
    }
}