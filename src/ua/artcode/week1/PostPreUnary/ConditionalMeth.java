package ua.artcode.week1.PostPreUnary;

import java.util.Scanner;

/**
 * Created by User on 10.04.2016.
 */
public class ConditionalMeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter age:");
        int age =sc.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        }
         if (age >60){
        System.out.println("Too old");}

        else{
            System.out.println("To yong!");
        }
    }
}
