public class solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseInts(nums);
        printInts(nums);
    }

    public static void reverseInts(int[] nums) {
        for (int i = 0; i < nums.length / 2; ++i) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }

    public static void printInts(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; ++i)
            System.out.print(nums[i] + ", ");
        if (nums.length - 1 >= 0)
            System.out.println(nums[nums.length - 1] + "]");
        else
            System.out.println("]");
    }
}
