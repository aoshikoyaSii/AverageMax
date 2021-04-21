package com.company;

import java.awt.image.ImageProducer;
import java.util.Scanner;

public class MyArray {
    int size = 5;
    int [] numbers = new int [size];
    static Scanner scanner = new Scanner(System.in);

    public static  void ProduceArray (int[] numbers){
        int newArray=0;
        int avg = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter  array values: ");
            newArray = scanner.nextInt();
            scanner.nextLine();

            //get max value
            if(newArray > max){
                max = newArray;
            }

            //get average value
            avg += newArray;
        }
        System.out.println("Average: " + avg / newArray);
        System.out.println("Max Value: " + max);
    }



}
