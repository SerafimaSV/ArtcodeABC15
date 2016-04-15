package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 15.04.2016.
 */
public class HomeWork_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0 ){
            System.out.println(a/b  + " остаток " + a%b);
            System.out.println("true");
        }
        else {
            System.out.println(a/b  + " остаток " + a%b);
//            System.out.println(a/b);
//            System.out.println(b/a);
            System.out.println("false");
        }

    }
}
