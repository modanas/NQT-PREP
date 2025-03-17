public class StringCapitalizeFirstLast {
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        // Capitalize first letter of first word
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            // If current char is space and next char is valid, capitalize next char
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // Add space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // Capitalize first letter of next word
            }
            // Capitalize last letter of word (if next char is space or end of string)
            else if (i == str.length() - 1 || str.charAt(i + 1) == ' ') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            // Otherwise, add character as is
            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "my name is khan";
        System.out.println(toUppercase(str));
    }
}
