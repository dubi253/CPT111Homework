import java.util.Scanner;

public class DateToDay {
    public static void main(String[] args) {
        short y;//y (year), m (month), and d (day)
        byte m, d, day;
        int a, b, c;
        Scanner keyboard = new Scanner(System.in);
        y = Short.parseShort(keyboard.nextLine());
        m = Byte.parseByte(keyboard.nextLine());
        d = Byte.parseByte(keyboard.nextLine());
        a = y - (14 - m) / 12;
        b = a + (a / 4) - (a / 100) + (a / 400);
        c = m + 12 * ((14 - m) / 12) - 2;
        day = (byte) ((d + b + (31 * c) / 12) % 7);
        System.out.println("It's day " + day + " !");
    }
}
