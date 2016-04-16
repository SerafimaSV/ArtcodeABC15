package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 16.04.2016.
 */
public class HomeWork_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый катет");
        int a = sc.nextInt();
        int dooblea = (int)Math.pow(a,2);
        System.out.println("Введите второй катет");
        int b = sc.nextInt();
        int doobleb = (int)Math.pow(b,2);
        System.out.println("Введите гипотенузу");
        int c = sc.nextInt();
        int dooblec = (int)Math.pow(c,2);
        if (a*a + b*b == c*c){
            System.out.println("треугольник прямоугольник");

        }
        else {
            System.out.println("False. Try again");
        }

    }
}
