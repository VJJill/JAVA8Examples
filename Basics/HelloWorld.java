package Basics;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add("World");
        l1.forEach(System.out::println);
    }
}
