package ua.artcode.week1.PostPreUnary;

/**
 * Created by User on 10.04.2016.
 */
public class CombineOperation {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;
        int c = 0;
        int d = -56;

        boolean answer1 = a > b;
        boolean anser2 = c != d;
        System.out.println(answer1 | anser2);

    }
}
