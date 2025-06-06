import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[j];
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], complement, nums[j]);
                    result.add(triplet);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}