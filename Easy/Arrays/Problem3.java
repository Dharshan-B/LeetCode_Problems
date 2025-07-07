package Easy.Arrays;

import java.util.Scanner;
import java.util.Arrays;

//1480. Running Sum of 1d Array
public class Problem3 {
  public static int[] runs(int[] nums){
      for(int i =1;i<nums.length;i++){
        nums[i]= nums[i]+nums[i-1];
      }
      return nums;
  }
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    int[] nums = new int[5];
    for(int i=0;i<nums.length;i++){
      nums[i] = sc.nextInt();
    }
    System.out.print(Arrays.toString(runs(nums)));
}
}
