package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 15.04.2016.
 */
public class HomeWork_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        if (c >=11 & c<=19){
            System.out.println(c);
        }
        else {
            System.out.println("Wrong! Try enter another numbers");
        }
    }
}
