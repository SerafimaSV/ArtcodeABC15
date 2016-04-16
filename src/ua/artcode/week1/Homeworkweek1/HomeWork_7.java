package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 16.04.2016.
 */
public class HomeWork_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 12");
        int month = sc.nextInt();

        if (3 <= month & month <= 5) {
            System.out.println("Spring");
        }

        else  if (6 <= month & month <=8){
            System.out.println( "Summer");
        }

        if (9 <= month & month <= 11){
            System.out.println("Autumn");
        }

        else if (month ==12 | (month<=2 & month >0)){
            System.out.println("Winter");
        }

        else if ((month>12) |(month <= 0)){
            System.out.println("Wrong! Try again");
        }
    }
}
