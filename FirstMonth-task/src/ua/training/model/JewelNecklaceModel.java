package ua.training.model;

import ua.training.model.entity.abstractions.Jewel;
import ua.training.model.entity.handlers.CommonPrice;
import ua.training.model.entity.handlers.CommonWeight;
import ua.training.model.entity.abstractions.CommonCharacteristic;
import ua.training.model.entity.handlers.JewelPriceComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;


public class JewelNecklaceModel {
    private List<Jewel> jewelNecklace;
    private List <CommonCharacteristic> characteristics;


    public JewelNecklaceModel() {
        jewelNecklace = new ArrayList<>();
        characteristics = new ArrayList<>();

        addCharacteristic(new CommonWeight(jewelNecklace));
        addCharacteristic(new CommonPrice(jewelNecklace));
    }


    private void addCharacteristic(CommonCharacteristic characteristic){
        characteristics.add(characteristic);
    }


    public void addJewelToNecklace(Jewel jewel){
        jewelNecklace.add(jewel);
    }


    /**
     * This method return the sorted Collection (TreeSet) of Jewels in Necklace.
     * Works by using Comparator.
     * @return  TreeSet of Jewels.
     */
    public TreeSet<Jewel> sortJewels(){

        Comparator<Jewel> jewelComparator = new JewelPriceComparator();
        TreeSet<Jewel> jewelsTreeSet = new TreeSet(jewelComparator);
        jewelsTreeSet.addAll(jewelNecklace);

        return jewelsTreeSet;
    }

    /**
     * This method used for search jewels suitable for transparency range.
     * @param lowerBound .
     * @param upperBound .
     * @return  Stream of suitable jewels.
     */
    public Stream<Jewel> searchJewelsInTransparencyRange(double lowerBound, double upperBound){

        Stream<Jewel> jewelStream = jewelNecklace.stream()
                .filter(j -> j.getTransparency() >= lowerBound
                && j.getTransparency() <= upperBound);

        return jewelStream;
    }

    public List<Jewel> getJewelNecklace() {
        return jewelNecklace;
    }

    public List<CommonCharacteristic> getCharacteristics() {
        return characteristics;
    }

    public void setJewelNecklace(ArrayList<Jewel> jewelNecklace) {
        this.jewelNecklace = jewelNecklace;
    }

}











//    public JewelNecklaceModel(ArrayList<Jewel> jewelNecklace) {
//        this.jewelNecklace = jewelNecklace;
//        characteristics = new ArrayList<>();
//
//        addCharacteristic(new CommonWeight(jewelNecklace));
//        addCharacteristic(new CommonPrice(jewelNecklace));
//    }

