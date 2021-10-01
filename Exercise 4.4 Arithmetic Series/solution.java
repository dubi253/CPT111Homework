public class solution {
    public static void main(String[] args) {
        int[] num = arithSeries(4);
        printArray(num);
    }

    public static int[] arithSeries(int n) {
        int[] outComeArray = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                outComeArray[index++] = j;
            }
        }
        return outComeArray;
    }

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++)
            System.out.print(nums[i] + ", ");
        if (nums.length - 1 >= 0)
            System.out.println(nums[nums.length - 1] + "]");
        else
            System.out.println("]");
    }
}
