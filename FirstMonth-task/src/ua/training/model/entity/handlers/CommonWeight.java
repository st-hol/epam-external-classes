package ua.training.model.entity.handlers;

import ua.training.model.entity.abstractions.CommonCharacteristic;
import ua.training.model.entity.abstractions.Jewel;
import ua.training.view.ConsumerView;
import static ua.training.view.TextConstants.*;

import java.util.List;
import java.util.stream.Stream;

public class CommonWeight extends CommonCharacteristic {

    public CommonWeight(List<Jewel> allJewels) {
        super(allJewels);
    }

    /**
     * This method calculates common Weight of JewelNecklace.
     * Works by summing weight of each jewel in list.
     *
     * @return Common weight of necklace.
      */
    public int calculateCommonWeight(){
        Stream<Jewel> weightStream = getAllJewels().stream();
        int commonWeight = weightStream.reduce(0,
                (x,y) -> x + y.getWeight(),
                (x, y) -> x + y
        );
        return commonWeight;
    }

    @Override
    public void countUp() {
        ConsumerView.printStringFromBundle(NOTICE_COMMON_WEIGHT_IS);
        System.out.print(calculateCommonWeight() + "\n");
    }
}




//    private ArrayList<Jewel> allJewels;
//
//    public CommonWeight(ArrayList<Jewel> allJewels) {
//        this.allJewels = allJewels;
//    }








//    public int calculateCommonWeight(){
//        Stream<Jewel> weightStream = allJewels.stream();
//        int result = weightStream.reduce(0,
//                (x,y) -> x + y.getWeight(),
//                (x, y) -> x + y
//        );
//
//         _____________________
//
//        int commonWeight = 0;
//        for (Jewel jewel: allJewels) {
//            commonWeight += jewel.getWeight();
//        }
//        return commonWeight;
//    }