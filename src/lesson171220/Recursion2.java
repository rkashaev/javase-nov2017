package lesson171220;

import java.util.Arrays;

public class Recursion2 {

    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target==0;
        }

        if (groupSum(start+1, nums, target-nums[start])) {
            System.out.printf("%s +- %d %n", indent(start), nums[start]);
            return true;
        }

        if (groupSum(start+1, nums, target)) {
            return true;
        }

        return false;
    }

    private static String indent(int start) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < start; i++) {
            space.append(" ");
        }

        return space.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, 2, 5, 3, 8, 9};

        System.out.println(Arrays.toString(nums));

        groupSum(0, nums, 29);
    }
}
