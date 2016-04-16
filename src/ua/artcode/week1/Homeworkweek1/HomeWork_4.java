package ua.artcode.week1.Homeworkweek1;

/**
 * Created by User on 16.04.2016.
 */
public class HomeWork_4 {
    public static void main(String[] args) {
        double speed_km_h = 5;
        double speed_m_s = 2000;
        double speed = speed_km_h *1000/3600;

        boolean answer_1 = speed_m_s > speed;
        System.out.println( answer_1 );

        boolean answer_2 = speed_m_s < speed;
        System.out.println( answer_2 );
    }
}
