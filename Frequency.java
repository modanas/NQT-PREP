public class Frequency {
 public static void frequency(int arr[]) {
  
  int n = arr.length;
  int freq[] = new int[n];

  int visited = -1;  //already visited

  for (int i = 0; i < n; i++) {
   int count = 1;
   for(int j = i+1; j < n; j++) {
    if(arr[i] == arr[j]){
      count++;
      freq[j] = visited;   
    }
    if(freq[i] != visited) {
     freq[i] = count;
    }
   }
  }
  for (int i = 0; i < freq.length; i++) {
   if(freq[i] != visited) {
    System.out.println("Element | Frequency");
    System.out.println(arr[i] + "         " + freq[i]);
   }
  }
 }
 public static void main(String[] args) {
  int arr[] = {1, 2, 3, 4, 2, 2, 3, 1};
  frequency(arr);
 }
}
