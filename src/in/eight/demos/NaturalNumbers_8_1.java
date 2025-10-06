package in.eight.demos;

import java.util.List;
import java.util.stream.IntStream;

// Three ways to create Natural numbers printing program
public class NaturalNumbers_8_1 {
    public static void main(String[] args) {

        int n=35;

        //IntStream.range(1, n).forEach(System.out::println);

        //IntStream.rangeClosed(1, n).forEach(i -> System.out.print(i+" "));


        List<Integer> lst = IntStream.rangeClosed(1, n)
                .boxed()
                .toList();

        System.out.println("LIST= "+lst);
    }
}
