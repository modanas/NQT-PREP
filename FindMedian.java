import java.util.*;
public class FindMedian {
 public static double Median(int arr[]) {
  int n = arr.length;

  if(n % 2 == 1) { //for odd case
   return arr[n / 2];
  }
  else {
   return (arr[n/2 - 1] + arr[n / 2]) / 2.0; //for even case
  }

 }
 public static void main(String[] args) {
   int arr[] = {7, 3, 1, 2, 5, 6};
   Arrays.sort(arr);
   System.out.println("Median of an array is :" + Median(arr));
 }
}
