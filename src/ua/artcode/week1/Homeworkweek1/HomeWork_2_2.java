package ua.artcode.week1.Homeworkweek1;

import java.util.Scanner;

/**
 * Created by User on 15.04.2016.
 */
public class HomeWork_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int firstnumber = sc.nextInt();
        int secondnumber = sc.nextInt();
        int thirdnumber = sc.nextInt();

        if (firstnumber>secondnumber & firstnumber>thirdnumber){
            System.out.println( "firstnumber - max number");
        }
        else if (secondnumber>firstnumber & secondnumber>thirdnumber){
            System.out.println("secondnumber - max number");
        }
        else {
            System.out.println(" thirdnumber - max number");
        }
        if (firstnumber<secondnumber & firstnumber<thirdnumber){
            System.out.println( "firstnumber - min number");
        }
        else if (secondnumber<firstnumber & secondnumber<thirdnumber){
            System.out.println("secondnumber- min number");
        }
        else {
            System.out.println("thirdnumber - min number");
        }
    }
}
