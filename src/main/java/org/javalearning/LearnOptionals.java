package org.javalearning;

import java.util.Optional;

public class LearnOptionals {

    public static void main(String[] args) {
        String nameStr = "ABC";
        //Optional<String> name = Optional.of(nameStr); // will give null pointer exception if nameStr is null
        // Right way to use is like below
        Optional<String> name = Optional.ofNullable(nameStr); // ofNullable is the correct way to use
        if (name.isPresent()) {
            System.out.println(name.get().toLowerCase()); // Use get() method to retrieve a value
        }
        if (!name.isEmpty()) {
            System.out.println(name.get().toLowerCase());
        } else {
            System.out.println(name);
        }

        System.out.println(Optional.empty()); // Either it can be empty or have a value

        System.out.println(orElse(null));
        System.out.println(orElse("not optional"));

    }

    private static String orElse(String someString) {
        Optional<String> name = Optional.ofNullable(someString); // ofNullable is the correct way to use
        name.ifPresent( value -> System.out.println(value) );
        name.ifPresent( value -> {
            System.out.println(value);
            System.out.println("testing ###");
        });
        return name.orElse("default value");
    }
}
