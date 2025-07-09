package Easy.Arrays;
//1431. Kids With the Greatest Number of Candies
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem6 {
  public List<Boolean> kidss(int[] candies,int ExtraCandies){
    ArrayList<Boolean> list = new ArrayList<>();

    //Checking the maximum element in the list 
    int max = candies[0];
    for(int i =0;i<candies.length;i++){
      if(candies[i]> max){
        max = candies[i];
      }
    }
    //Assigning the extracandies and checking
    for(int i =0;i<candies.length;i++){
      if((candies[i]+ExtraCandies)>= max){
        list.add(true);
      }
      else{
        list.add(false);
      }
    }
    return list;
  }
  public static void main(String[] args){
    Problem6 obj = new Problem6();
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    List<Boolean> result = obj.kidss(candies, extraCandies);
    System.out.println(result);
  }
}

