package com.company;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");

        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double avg = (x + y + z);
        System.out.println(avg);

        double avg2 = avg / 2;
        if (avg2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}