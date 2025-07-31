package com.example.demo;
import java.util.Scanner;
public class FindTheSmallestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        int SecondNumber = sc.nextInt();

        int Sum =  FirstNumber + SecondNumber;

        System.out.println(Sum);
        sc.close();
    }

}
