public class MoveAllZeroesToRight {
 public static void moveZeroes(int[] nums) {
  int n = nums.length;
  int insertPos = 0;

  for (int i = 0; i < n; i++) {
   //Fill all non-zero elements at the beginning
   if(nums[i] != 0) {
    nums[insertPos] = nums[i];
    insertPos++;
   }
  }
  while(insertPos < n) {
   nums[insertPos] = 0;
   insertPos++;
  }
 }
 public static void main(String[] args) {
  int nums[] = {1, 2, 0, 3, 0, 0, 8};
  moveZeroes(nums);
  for(int i = 0; i < nums.length; i++) {
   System.out.print(nums[i] + " ");
  }
 }
}
