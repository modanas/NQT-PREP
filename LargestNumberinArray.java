import java.util.*;
public class LargestNumberinArray {
 public static int lrgst(int arr[]) {
  int largest = Integer.MIN_VALUE;

  for(int i = 0; i < arr.length; i++) {
   if(largest < arr[i]) {
    largest = arr[i];
   }
  }
  System.out.println("Largest number of an array : " + largest);
  return largest;
 }
 public static void main(String[] args) {
  int arr[] = {4, 6, 8, 9, 1, 2};
  lrgst(arr);
 }
}
