public class cw5_2 {
    public static void main(String[] args) {
        System.out.println(calcNetIncome("salary 15000yuan bonus2000 rent -1000Y"));
        System.out.println(calcNetIncome("25000 gross income, -200 water, electricity:-300"));
        System.out.println(calcNetIncome(""));
    }

    public static int calcNetIncome(String input) {
        int beginNumberIndex = -1, endNumberIndex, outCome = 0;
        for (int i = 0, inputLength = input.length(); i < inputLength; ++i) {
            if (Character.isDigit(input.charAt(i))) {
                if (beginNumberIndex >= 0) {
                    if (i + 1 < inputLength && Character.isDigit(input.charAt(i + 1))) continue;
                    endNumberIndex = i;
                    int temp = Integer.parseInt(input.substring(beginNumberIndex, endNumberIndex + 1));
                    outCome += beginNumberIndex - 1 >= 0 && input.charAt(beginNumberIndex - 1) == '-' ? -temp : temp;
                    beginNumberIndex = -1;
                } else beginNumberIndex = i--;
            }
        }
        return outCome;
    }
}
