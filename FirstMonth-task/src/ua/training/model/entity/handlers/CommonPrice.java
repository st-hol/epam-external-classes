package ua.training.model.entity.handlers;

import ua.training.model.entity.abstractions.CommonCharacteristic;
import ua.training.model.entity.abstractions.Jewel;
import ua.training.view.ConsumerView;

import java.util.List;
import java.util.stream.Stream;

import static ua.training.view.TextConstants.*;

public class CommonPrice extends CommonCharacteristic {

    public CommonPrice(List<Jewel> allJewels) {
        super(allJewels);
    }

    /**
     * This method calculates common Price of JewelNecklace.
     * Works by summing value of each jewel in list.
     *
     * @return Common price of necklace.
     */
    public long calculateCommonPrice(){
        Stream<Jewel> priceStream = getAllJewels().stream();
        long commonPrice = priceStream.reduce(0L,
                (x,y) -> x + y.getPrice(),
                (x, y) -> x + y
        );
        return commonPrice;
    }


    @Override
    public void countUp() {
        ConsumerView.printStringFromBundle(NOTICE_COMMON_PRICE_IS);
        System.out.print(calculateCommonPrice() + "\n");
    }
}






//    private ArrayList<Jewel> allJewels;
//
//    public CommonPrice(ArrayList<Jewel> allJewels) {
//        this.allJewels = allJewels;
//    }
