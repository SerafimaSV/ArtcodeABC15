package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 15.04.2016.
 */
public class HomeWork_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int firstnumber = sc.nextInt();
        int secondnumber = sc.nextInt();
        if (firstnumber > secondnumber){
            System.out.println(firstnumber - secondnumber);
        }
        else {
            System.out.println(firstnumber + secondnumber);
        }
    }
}
