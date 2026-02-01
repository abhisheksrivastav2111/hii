package hii;
import java.util.HashMap;
import java.util.Map;

class addTwo {

    public static int[] result(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; 
    }

    public static void main(String[] args) {
        int[] nums = {2, 8, 7, 11, 15};
     
        int[] ans = result(nums, 9);
     // feature1 change
System.out.println("Running feature1 branch");

        
        if (ans.length == 2) {
            System.out.println("Indices: " + ans[0] + ", " + ans[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
