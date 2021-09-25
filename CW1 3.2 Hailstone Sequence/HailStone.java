import java.util.Scanner;

public class HailStone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, length = 1;
        n = Integer.parseInt(keyboard.nextLine());
        while (1 < n) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            ++length;
        }
        System.out.println(length);
    }
}
