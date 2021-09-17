import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x1, x2, y1, y2;
        x1 = Math.toRadians(Double.parseDouble(keyboard.nextLine()));
        y1 = Math.toRadians(Double.parseDouble(keyboard.nextLine()));
        x2 = Math.toRadians(Double.parseDouble(keyboard.nextLine()));
        y2 = Math.toRadians(Double.parseDouble(keyboard.nextLine()));
        System.out.println(12742 * Math.asin(Math.sqrt(Math.pow(Math.sin((x2 - x1) / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y1 - y2) / 2), 2))) + " kilometres");
        keyboard.close();
    }
}
