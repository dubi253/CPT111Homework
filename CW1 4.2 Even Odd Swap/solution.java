public class solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 0, 0, 1, 0};
        printArray(evenOddSwap(nums));
//        printArray(newevenOddSwap(nums));//Another solution for this question
    }

    public static int[] evenOddSwap(int[] nums) {
        int[] evenIndex = new int[nums.length / 2], oddIndex = new int[nums.length / 2];
        int even = 0, odd = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] % 2 == 0) {
                evenIndex[even++] = i;
            } else {
                oddIndex[odd++] = i;
            }
        }
        for (int i = 0; i < evenIndex.length; ++i) {
            int temp = nums[evenIndex[i]];
            nums[evenIndex[i]] = nums[oddIndex[i]];
            nums[oddIndex[i]] = temp;
        }
        return nums;
    }

    public static int[] newevenOddSwap(int[] nums) {//Another solution for this question
        boolean[] flag = new boolean[1000];
        for (int i = 0; i < nums.length; i++) {
            if (flag[i]) continue;
            int mid = nums[i] % 2;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % 2 != mid) {
                    flag[j] = true;
                    flag[i] = true;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        return nums;
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
