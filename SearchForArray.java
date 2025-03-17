public class SearchForArray {
 public static void search(int arr[], int k) {
  int n = arr.length;

  for (int i = 0; i < n; i++) {
   if(arr[i] == k) {
    System.out.println(k + " found at index " + i);
    return;
   }
  }
 }
 public static void main(String[] args) {
  int arr[] = {1, 3, 4, 9, 13, 11, 7};
  search(arr, 9);
 }
}
