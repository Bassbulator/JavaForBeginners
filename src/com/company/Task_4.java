package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int avg = (x + y + z);
        System.out.println(avg);

        int avg2 = avg / 2;
        if (avg2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}