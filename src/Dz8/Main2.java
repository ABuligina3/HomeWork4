package Dz8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("Dmitriy", "live", "in", "owl", "city"));

        Optional<String> text = words.stream().reduce((a, b) -> a + " " + b);
        System.out.println(text.get());
    }
}