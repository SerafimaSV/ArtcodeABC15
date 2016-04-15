package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 15.04.2016.
 */
public class HomeWork_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double a = sc.nextDouble();
        if (0 < a & a < 1) {
            System.out.println("Right");
        }
        else {
            System.out.println("Wrong! Try enter another number ");
        }
    }
}
