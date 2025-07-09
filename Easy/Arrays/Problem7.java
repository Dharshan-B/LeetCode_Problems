package Easy.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
//1512. Number of Good Pairs
public class Problem7{
    public  static int good(int[] nums){
      //1.Counting Frequency 
      int[] count = new int[102];
       for(int i =0;i<nums.length;i++){
        count[nums[i]]++;
       }
       //2.Calculating the Total Count using the formula ---> (i*(i-1))/2
       int totalCount = 0;
       for(int i =0;i<count.length;i++){
        totalCount += (count[i]* (count[i]-1))/2;
       }
       return totalCount;
    }
  public static void main(String[] args){
    int[] nums= {2,3,4,2,2,5,6,7,7,8};
    int ans = good(nums);
    System.out.print(ans);
  }
}

// Most simple problem and needs very simple thinking as it just checks for the same element in the array and sets them.
