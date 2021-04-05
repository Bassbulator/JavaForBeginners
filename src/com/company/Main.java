package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int a = array[0]; // присвоилась 1
        array[0] = array[array.length -1]; // первый эл-т стал посл
        array[array.length -1] = a; // сохранили в посл эл что было в первом
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
