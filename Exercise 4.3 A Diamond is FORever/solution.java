public class solution {
    public static void main(String[] args) {
        diamond(9);
    }

    public static void diamond(int n) {
        if (n % 2 == 1) {
            int decimal = (n - 1) / 2;
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < decimal; ++j)
                    System.out.print(". ");
                for (int j = 0; j <= i; j++)
                    System.out.print("* ");
                for (int j = 0; j < decimal; ++j)
                    System.out.print(". ");
                System.out.println();
                --decimal;
            }
            decimal = 1;
            for (int i = n - 2; i > 0; i -= 2) {
                for (int j = 0; j < decimal; ++j)
                    System.out.print(". ");
                for (int j = 0; j < i; ++j)
                    System.out.print("* ");
                for (int j = 0; j < decimal; ++j)
                    System.out.print(". ");
                System.out.println();
                ++decimal;
            }
        }
    }
}
