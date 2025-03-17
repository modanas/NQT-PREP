public class FindPairs {
 public static void pairs(int arr[]) {
  int n = arr.length;

  for (int i = 0; i < n; i++){
   int curr = arr[i];    //for first one it will take 2

   for(int j = i + 1; j < n; j++) {   //and it will take 4,6,8,10 and make individual pairs of it with 2
    System.out.print("(" + curr + "," + arr[j] + ") ");
   }
  }
 }
 public static void main(String[] args) {
  int arr[] = {2, 4, 6, 8, 10};
  pairs(arr);
 }
}
