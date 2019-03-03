package ua.training.model.entity.handlers;

import ua.training.model.entity.abstractions.Jewel;

import java.util.Comparator;

public class JewelPriceComparator implements Comparator<Jewel> {

    /**
     * This method calculates common Price of JewelNecklace.
     * Works by summing value of each jewel in list.
     * @param a, b сomparable values.
     * @return  1 if a is Bigger.
     *          -1 if a is smaller.
     *          0 if values are equal
     */
    public int compare(Jewel a, Jewel b){
        long aPrice = a.getPrice();
        long bPrice = b.getPrice();

        if(aPrice > bPrice)
            return 1;
        else if(aPrice < bPrice)
            return -1;
        else
            return 0;
    }
}