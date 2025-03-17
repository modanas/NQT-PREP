public class StringFreqCal {
 public static String frequency(String name) {
     int n = name.length();
     
     for (char ch = 'a'; ch <= 'z'; ch++) { // Check lowercase letters
         int count = 0;
         for (int i = 0; i < n; i++) {
             if (ch == name.charAt(i)) {
                 count++;
             }
         }
         if (count > 0) { // Print only characters that appear
             System.out.println(ch + ": " + count);
         }
     }
     return name;
 }

 public static void main(String[] args) {
     String name = "Md Anas Jawed";
     frequency(name);
 }
}
