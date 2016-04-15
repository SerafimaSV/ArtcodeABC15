package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 15.04.2016.
 */
public class HomeWork_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if (n % 7 == 0){
            System.out.println(n*2);
        }
    }
}
