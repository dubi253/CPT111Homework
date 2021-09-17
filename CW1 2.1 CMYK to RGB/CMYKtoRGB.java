import java.util.Scanner;

public class CMYKtoRGB {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double cyan, magenta, yellow, black, white;
        cyan = Double.parseDouble(keyboard.nextLine());
        magenta = Double.parseDouble(keyboard.nextLine());
        yellow = Double.parseDouble(keyboard.nextLine());
        black = Double.parseDouble(keyboard.nextLine());
        white = 1 - black;
        System.out.println("red = " + (int) Math.round(255 * white * (1 - cyan)));
        System.out.println("green = " + (int) Math.round(255 * white * (1 - magenta)));
        System.out.println("blue = " + (int) Math.round(255 * white * (1 - yellow)));
        keyboard.close();
    }
}
