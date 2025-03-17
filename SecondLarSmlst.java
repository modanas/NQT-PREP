
import java.util.*;
public class SecondLarSmlst {
  public static void printArr(int arr[]) {
   int n = arr.length;

   for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
   }
   System.out.println();
  }
  public static void main(String[] args) {
   int arr[] = {9, 5, 6, 1, 3, 0};
   Arrays.sort(arr);

   System.out.println("Second smallest number is : "+ arr[1]);
   System.out.println("Second largest number is : "+ arr[arr.length - 2]);
   printArr(arr);
  }
}
