package com.skillsup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 45, 6};
        List<Integer> l = Arrays.asList(arr);

        Collections.sort(l, Collections.reverseOrder());

        System.out.println(l);
    }
}