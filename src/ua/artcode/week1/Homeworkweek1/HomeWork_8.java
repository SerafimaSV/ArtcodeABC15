package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 16.04.2016.
 */
public class HomeWork_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        double praice = sc.nextDouble();

        if (praice > 1000){
            System.out.println(praice - (praice*0.1));
        }

        else {
            System.out.println("No discount");
        }




    }
}
