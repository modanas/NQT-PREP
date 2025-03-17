
import java.util.*;
public class Reverse {
 public static void printArr(int arr[]) {
  int n  = arr.length;

  for (int i = 0; i < n; i++) {
   System.out.print(arr[i] + " ");
  }
  System.out.println();
 }
 public static int reverseArr(int arr[]) {
  int first = 0, last = arr.length - 1;

  while(first < last) {
    //swap
    int temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;

    first++;
    last--;
  }
  return 0;
 }
 public static void main(String[] args) {
  int arr[] = {1, 2, 3, 4, 5, 6};
  reverseArr(arr);
  printArr(arr);
 }
}
