import java.util.*;

public class FindUnique {
    public static void unique(int nums[]) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i] != nums[i - 1]) && (i == nums.length - 1 || nums[i] != nums[i + 1])) {
                System.out.print(nums[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 2, 4, 2};
        unique(nums);
    }
}
