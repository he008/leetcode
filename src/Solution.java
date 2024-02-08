import java.util.*;

/**
 * @author alpha
 */
public class Solution {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        solution.groupAnagrams(strs);
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

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> value;
            if (map.containsKey(key)) {
                value = map.get(key);
            } else {
                value = new ArrayList<>();
            }
            value.add(str);
            map.put(key, value);
        }

        List<List<String>> result = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
