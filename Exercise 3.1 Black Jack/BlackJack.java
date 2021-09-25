import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte input_number_1, input_number_2;
        input_number_1 = Byte.parseByte(keyboard.nextLine());
        input_number_2 = Byte.parseByte(keyboard.nextLine());
        if (21 >= input_number_1 && input_number_1 >= input_number_2) {
            System.out.println(input_number_1);
        } else if (21 >= input_number_2 && input_number_2 >= input_number_1) {
            System.out.println(input_number_2);
        } else if (input_number_1 > 21 && 21 >= input_number_2) {
            System.out.println(input_number_2);
        } else if (21 >= input_number_1) {
            System.out.println(input_number_1);
        } else {
            System.out.println("-1");
        }
    }
}
