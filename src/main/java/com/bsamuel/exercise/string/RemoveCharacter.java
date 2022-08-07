package com.bsamuel.exercise.string;

import java.util.stream.Collectors;

public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {

        return str.chars().filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
