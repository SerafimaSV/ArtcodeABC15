package ua.artcode.week1.Homeworkweek1;


import java.util.Scanner;

public class HomeWork_2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a%10;
        int d = b%10;


        if (c==b ){
            System.out.println("True");

        }
        else if (  d==c){
            System.out.println("True");

        }
        else System.out.println("False");

        }
}
