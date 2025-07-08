package Easy.Arrays;
//1470. Shuffle the Array
import java.util.Scanner;
import java.util.Arrays;
public class Problem5 {
  public static int[] shuff(int[] nums,int n){
    int[] result = new int[2*n];
    for(int i =0;i<2*n;i++){
      if(i%2 == 0){
        result[i] = nums[i/2];
      }
      else{
        result[i] = nums[n+i/2];
      }
    }
    return result;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[6];
    int n = sc.nextInt();
    for(int i =0;i<nums.length;i++){
      nums[i] = sc.nextInt();
    }
    System.out.print(Arrays.toString(shuff(nums,n)));
  }
}
