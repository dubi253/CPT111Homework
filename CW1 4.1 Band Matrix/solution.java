public class solution {
    public static void main(String[] args) {
        bandMatrix(4, 2);
    }

    public static void bandMatrix(int n, int width) {
        String[][] outComeArray = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                outComeArray[i][j] = "0";
        }
        for (int i = 0; i < n; i++) {
            outComeArray[i][i] = "*";
            for (int j = 0; j <= width; ++j) {
                if (i - j >= 0)
                    outComeArray[i][i - j] = "*";
                if (i + j < n)
                    outComeArray[i][i + j] = "*";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(outComeArray[i][j] + "  ");
            System.out.println();
        }
    }
}

