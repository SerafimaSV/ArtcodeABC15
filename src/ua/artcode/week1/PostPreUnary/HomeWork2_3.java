package ua.artcode.week1.PostPreUnary;

import java.util.Scanner;

/**
 * Created by User on 10.04.2016.
 */
public class HomeWork2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number % 7 == 0) {
            System.out.println(number * 2);
        }
    }

}