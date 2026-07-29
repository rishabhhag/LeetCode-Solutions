

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // sorting the array helps
        Arrays.sort(nums); 

        // 2. i shouldnt be on same as left and right pointer soo settign its limit
        for (int i = 0; i < nums.length - 2; i++) {
            
            //once a triplet is found with 1 it shouldnt duplicate it
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            //2 pointer

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    left++;
                    right--;
                    
                    // left should not be duplicated
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // right should not be duplicated
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    
                } else if (sum < 0) {

                    left++; 
                } else {

                    right--; 
                }
            }
        }
        return result;
    }
}