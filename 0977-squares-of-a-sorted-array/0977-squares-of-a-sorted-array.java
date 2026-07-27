class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; 
        
        int left = 0;
        int right = n - 1;
        
        for (int i = n - 1; i >= 0; i--) {
            // A single basic addition to determine which side is larger
            if (nums[left] + nums[right] < 0) {
                result[i] = nums[left] * nums[left];
                left++; 
            } else {
                result[i] = nums[right] * nums[right];
                right--; 
            }
        }
        
        return result;
    }
}