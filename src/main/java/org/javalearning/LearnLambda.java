package org.javalearning;

import java.util.List;
import java.util.stream.Collectors;

public class LearnLambda {

    public static void main(String[] args) {
        List<String> places = List.of("AZ", "MI", "RA");
        System.out.println(places.stream()
                                .filter(p -> p.contains("A"))
                                .map(p -> { return "Place:" + p; })
                                .collect(Collectors.toList())
                            );
    }
}
