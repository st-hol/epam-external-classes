import java.util.*;
import java.util.stream.IntStream;
import static java.util.Comparator.comparingInt;

public class Main {

    public static void main(String[] args) {


        int[] intArr = new int[]{-5,0,-100,2,4,5,8,7,81,4};
        //IntStream intStream = Arrays.stream(intArr);

        //1
        System.out.println("Average = " + Arrays.stream(intArr).average().getAsDouble());


        //2
        OptionalInt obj = Arrays.stream(intArr).min();
        if (obj.isPresent()) {
            System.out.println("MINIMUM = " + obj.getAsInt());
        } else {
            System.out.println("Это фиаско, братан");
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-5,0,-100,2,4,5,8,7,81,4));
        int minIndex = IntStream.range(0,list.size()).boxed()
                .min(comparingInt(list::get))
                .get();  // or throw if empty list
        System.out.println("min INDEX = " + minIndex);


        //3
        System.out.println("NULLS quantity = " + Arrays.stream(intArr).filter(item -> item == 0).count());


        //4
        System.out.println("POSITIVES quantity = " + Arrays.stream(intArr).filter(item -> item >= 0).count());


        //5
        Arrays.stream(intArr).map( i -> i*10).forEach(System.out::println);

    }
}










//        Arrays.parallelSetAll(intArr, i -> i*10);
//        for (int item: intArr) {
//            System.out.print(item + " ");
//        }


