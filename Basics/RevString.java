package Basics;

import java.util.Scanner;
import java.util.function.Function;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Function<String, String> function = s1 ->
        {
            StringBuilder sb = new StringBuilder(s1);
            sb.reverse();
            return sb.toString();
        };
        System.out.println(function.apply(s));
    }
}
