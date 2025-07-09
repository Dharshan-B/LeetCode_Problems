package Easy.Arrays;
//27. Remove Element
public class Problem_14 {
   public static int removeElement(int[] nums, int val) {
        int k = 0; // next position for non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move valid element forward
                k++;
            }
        }

        return k; // new length
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
