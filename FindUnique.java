import java.util.*;
public class FindUnique {
 public static int unique(int nums[]) {
  Arrays.sort(nums);

  for (int i = 0; i < nums.length - 1; i++) {
   if(nums[i] != nums[i+1]) {
     if(i == 0 || nums[i] != nums[i-1]) {
      return nums[i];
     }
   }
  }
  return nums[nums.length - 1];
 }
 public static void main(String args[]) {
  int nums[] = {5, 3, 2, 3, 2};
  System.out.println(unique(nums));
 }
}
