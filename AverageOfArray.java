public class AverageOfArray {
 public static void printArr(int arr[]) {
  int n = arr.length;

  for (int i = 0; i < n; i++) {
   System.out.print(arr[i] + " ");
  }
  System.out.println();
 }
 public static void Average(int arr[]) {
  int sum = 0;
  int n = arr.length;

  for(int i = 0; i < n ; i++) {
   sum += arr[i];
  }
  // return sum / n;
  System.out.println("Average is : " + sum / n);
  System.out.println("Sum is : " + sum);
 }
 public static void main(String[] args) {
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  Average(arr);
  // printArr(arr);
 }
}
