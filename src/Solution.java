import java.util.*;

/**
 * @author alpha
 */
public class Solution {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            if (map.containsKey(r)) {
                return new int[]{map.get(r), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }
}
