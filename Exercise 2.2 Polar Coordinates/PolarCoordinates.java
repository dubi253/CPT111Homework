import java.util.Scanner;

public class PolarCoordinates {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float x, y;
        x = Float.parseFloat(keyboard.nextLine());
        y = Float.parseFloat(keyboard.nextLine());
        System.out.println("r = " + Math.hypot(x, y));
        System.out.println("theta = " + Math.atan2(y, x));
    }
}
