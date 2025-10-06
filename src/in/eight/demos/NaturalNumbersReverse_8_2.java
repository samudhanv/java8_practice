package in.eight.demos;

import java.util.stream.IntStream;

public class NaturalNumbersReverse_8_2 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 15)
                .map(n -> 16-n)
                .forEach(n -> System.out.print(n+" "));
    }
}

