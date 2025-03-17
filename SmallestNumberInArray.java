public class SmallestNumberInArray {
 public static int smlst(int arr[]) {
  int smallest = Integer.MAX_VALUE;
  for (int i = 0; i < arr.length; i++) {
   if(smallest > arr[i]) {
    smallest = arr[i];
   }
  }
  System.out.println("Smallest number is : " + smallest);
  return smallest;
 }
 public static void main(String[] args) {
  int arr[] = {5, 7, 1, 3, 2, 6};
  smlst(arr);
 }
}
