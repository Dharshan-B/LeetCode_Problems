package Easy.Arrays;
//1929. Concatenation of Array
import java.util.Scanner;
import java.util.Arrays;
public class Problem2 {
  public static int[] concate(int[] nums){
    int n = nums.length;
    int[] ans = new int[2*n];
    for(int i =0;i<n;i++){
      ans[i] = nums[i];
      ans[i+n] = nums[i];
    }
      return ans ;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[5];
    for(int i =0;i<nums.length;i++){
      nums[i] = sc.nextInt();
    }
    System.out.print(Arrays.toString(concate(nums)));
  }
}
