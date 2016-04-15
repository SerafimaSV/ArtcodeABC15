package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 12.04.2016.
 */
public class HomeWork_4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time!");
        int time = sc.nextInt();

       // if (time > 9 | time < 18 ){
            //System.out.println("Я на работе!((");//
       // }
         if ( time >= 9 & time <=18 ){
             System.out.println("I'm working!!");
         }
         else {
             System.out.println("I'm at home!!!))");
         }


                    }
}
