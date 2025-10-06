package in.eight.demos;

import java.util.stream.IntStream;

public class NaturalNumbersReverse_8_1 {

    public static void main(String[] args) {

        int range =11;

        IntStream.iterate(50, i -> i-1)
                .limit(range)
                .forEach(i -> System.out.print(i+" "));
    }
}
