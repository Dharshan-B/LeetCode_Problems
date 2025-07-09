package Easy.Arrays;

public class Problem11 {
  public static int findNumber(int[] nums){
    int count = 0;
    for(int num : nums){
      if(even(num)){
        count++;
      }
    }
    return count;

  }
  static boolean even(int num){
    int numofD = digits(num);
    return numofD % 2 == 0;
  }
  static int digits(int num){
    int count = 0;
    if(num < 0){
      num = num* -1;
    }
    if(num == 0){
      return 1;
    }
    while(num>0){
      count++;
      num = num/10;
    }
    return count;
  }
  
   public static void main(String[] args){
    int[] nums = {12,1,2,3,4,1232};
    System.out.print(findNumber(nums));
   }
}
