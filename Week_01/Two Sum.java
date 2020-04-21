class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] res = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target - nums[i];
            if (count.containsKey(anotherNum) && count.get(anotherNum) != i) {
                res[0] = i;
                res[1] = count.get(anotherNum);
                return res;
            }
        }
        return res;
    }
}