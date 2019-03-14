package ua.training;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstTask {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,6,123,123,89,13,2,0));

        lst.forEach(x-> System.out.println( "'"+ x + "'" + " встречается в списке " + Collections.frequency(lst, x) +" раз."+ "\n"));
    }
}
