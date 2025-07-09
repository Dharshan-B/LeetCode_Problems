package Easy.Arrays;
//Sort Array By Parity
import java.util.Arrays;
public class Problem_15 {
  public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            // i moves until it finds an odd number
            while (i < j && nums[i] % 2 == 0) i++;

            // j moves until it finds an even number
            while (i < j && nums[j] % 2 == 1) j--;

            // Swap odd at i with even at j
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);

        System.out.print("Sorted by Parity: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
