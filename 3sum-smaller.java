import java.util.Arrays;

public class dsa {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 3, 4, 5};
        int target = 11;

        

        int count = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < target) {
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }

    System.out.println("Number of triplets with sum less than " + target + ": " + count);
    }
}
