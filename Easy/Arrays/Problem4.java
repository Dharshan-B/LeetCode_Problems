package Easy.Arrays;
//Rickest Customer Wealth
import java.util.Scanner;
import java.util.Arrays;

public class Problem4 {
  public static int rich(int[][] accounts){
    int maxWealth =0;
    for (int i = 0; i < accounts.length; i++) {
    int customerWealth = 0;
    for (int j = 0; j < accounts[i].length; j++) {
        customerWealth += accounts[i][j];
        }
            maxWealth = Math.max(maxWealth, customerWealth);
     }        
        return maxWealth;
  }
  public static void main(String[] args){
     Scanner sc  = new Scanner(System.in);
     int[][] accounts = new int[5][5];
     for(int i =0;i<5;i++){
      for(int j =0;j<5;j++){
        accounts[i][j] = sc.nextInt();
      }
     }
     System.out.print(rich(accounts));
  }
}
