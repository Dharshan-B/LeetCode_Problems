package Easy.Arrays;

public class Problem10 {
   public static int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numofD =digits(num);
        return numofD % 2 ==0;
    }

    static int digits(int num){
        int count = 0;
        if(num < 0){
            num =num*-1;
        }
        if(num == 0){
            return 1;
        }
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args){
            int[] nums = {12,2,3,455,1234};
            System.out.print(findNumbers(nums));
    } 
  
}
