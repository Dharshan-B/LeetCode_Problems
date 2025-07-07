package Easy.Arrays;
//1920. Build Array from Permutation
import java.util.Scanner;
import java.util.Arrays;
public class Problem1 {
  public static int[] buildarray(int[] nums){
    int[] ans = new int[nums.length];
    for(int i =0;i<nums.length;i++){
        ans[i] = nums[nums[i]];
    }
       return ans;
  }
  //Driver's Code
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Size?");
   int n = sc.nextInt();
   int[] nums = new int[n];
   for(int i =0;i<nums.length;i++){
      nums[i] = sc.nextInt();
   }
   int ans1[] = buildarray(nums);
   System.out.println(Arrays.toString(ans1));

  }
}
