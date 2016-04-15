package ua.artcode.week1.PostPreUnary;

/**
 * Created by User on 10.04.2016.
 */
public class PostPreUnary {
    public static void main(String[] args) {

        int a = 25;
        int b = a++;
        System.out.println("A=" +a);
        System.out.println("B=" +b);

        int c = 25;
        int d = ++c;
        System.out.println("C = " +c);
        System.out.println("D = "+d);

    }


}
