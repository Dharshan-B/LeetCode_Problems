package Easy.Arrays;
//26. Remove Duplicates from Sorted Array
import java.util.Arrays;
public class Problem_11{
  public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Move unique value forward
            }
        }

        return i + 1; // Total unique elements
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Updated nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}