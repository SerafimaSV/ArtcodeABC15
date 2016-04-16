package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 16.04.2016.
 */
public class HomeWork_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0){
            System.out.println((int) Math.pow(a, 3));
        }
        else {
            System.out.println(a = 0);
        }
        if (b>0){
            System.out.println((int) Math.pow(b, 3));
        }
        else {
            System.out.println(b = 0);
        }
        if (c>0){
            System.out.println((int) Math.pow(c, 3));
        }
        else {
            System.out.println(b=0);

        }


    }
}