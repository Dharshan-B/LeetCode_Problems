package Easy.Arrays;
//66. Plus One
import java.util.Arrays;
public class Problem_12 {
  public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Otherwise, set this digit to 0 and continue (carry 1)
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the front
        int[] result = new int[digits.length + 1];
        result[0] = 1; // All others will be 0 by default
        return result;
    }
  
}
