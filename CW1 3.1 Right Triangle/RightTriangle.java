import java.util.Arrays;
import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] SideLength = new int[3];
        for (int i = 0; i < 3; ++i) {
            SideLength[i] = Integer.parseInt(keyboard.nextLine());
        }
        Arrays.sort(SideLength);
        if (SideLength[0] > 0 && (Math.hypot(SideLength[0], SideLength[1]) == SideLength[2])) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
