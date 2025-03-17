import java.util.*;

public class RepeatingElements {
    public static void repeating(int nums[]) {
        int n = nums.length;
        Arrays.sort(nums);
        
        // Loop to find all repeating elements
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                // Print the repeating element and skip duplicates
                System.out.print(nums[i] + " ");
                
                // Skip all subsequent duplicate elements to avoid printing them again
                while (i < n - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 5, 10, 7, 8, 2, 1, 3}; // the output should be 1 and 2
        repeating(nums);
    }
}



