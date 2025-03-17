public class AddingElem {
 public static void Add(int arr[]) {
  int pos = 3;
  int elem = 30;
  for (int i = arr.length-1; i > pos-1; i--) {
   arr[i] = arr[i-1];
  }
  arr[pos-1] = elem;

  for (int i = 0; i < arr.length; i++) {
   System.out.print(arr[i] + " ");
  }
 }
 public static void main(String[] args) {
  int arr[] = {10, 20, 40, 50};
  Add(arr);
 }
}