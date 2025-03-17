public class EquilibriumIndex {
 public static int equilibriumIndex(int arr[]) {
     int n = arr.length;
     int totalSum = 0;
     int leftSum = 0;

     // for one or two elemnts
     if (n == 0 || n == 1) {
         return -1; 
     }

     // to Calculate total sum of array
     for (int i = 0; i < n; i++) {
         totalSum += arr[i];
     }

     // Find equilibrium index
     for (int i = 0; i < n; i++) {
         int rightSum = totalSum - leftSum - arr[i];
         if (leftSum == rightSum) {
             return i;
         }
         leftSum += arr[i];
     }

     return -1; // No equilibrium index found
 }

 public static void main(String[] args) {
     int arr[] = {1, 2, 6, 4, 0, -1};
     System.out.println(equilibriumIndex(arr)); // Output: 3
 }
}
