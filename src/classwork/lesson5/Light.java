package classwork.lesson5;


public class Light {

    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 18600;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;
        System.out.print("За" + days);
        System.out.print("дней свет пройдет около ");
        System.out.println(distance + "миль.");
    }
}
