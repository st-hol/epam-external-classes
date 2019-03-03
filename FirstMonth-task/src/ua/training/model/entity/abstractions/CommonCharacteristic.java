package ua.training.model.entity.abstractions;

import ua.training.model.entity.abstractions.Jewel;

import java.util.ArrayList;
import java.util.List;

public abstract class CommonCharacteristic{

    private List<Jewel> allJewels;

    public CommonCharacteristic(List<Jewel> allJewels) {
        this.allJewels = allJewels;
    }

    /**
     * This method used to display certain characteristic.
     */
    abstract public void countUp();

    public List<Jewel> getAllJewels() {
        return allJewels;
    }

}







//public interface CommonCharacteristic {
//    void countUp();
//
//    void addJewel(Jewel jewel);
//}