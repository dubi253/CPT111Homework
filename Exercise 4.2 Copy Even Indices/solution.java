public class solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        nums = copyEven(nums);
        printArray(nums);
    }

    public static int[] copyEven(int[] nums) {
        int[] outComeNums = new int[(int) Math.round((double) nums.length / 2)];
        for (int i = 0; i < nums.length; i += 2)
            outComeNums[i / 2] = nums[i];
        return outComeNums;
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
