package ua.artcode.week1.PostPreUnary;
import java.util.Scanner;

/**
 * Created by User on 10.04.2016.
 */
class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter name");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("User name -" + name + ", age-" +age);






    }


}
