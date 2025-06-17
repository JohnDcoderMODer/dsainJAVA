public class ifIsogram {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        
        boolean isIsogram = true;
        int[] charCount = new int[26]; // Assuming only lowercase letters a-z
        
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCount[c - 'a']++;
                if (charCount[c - 'a'] > 1) {
                    isIsogram = false;
                    break;
                }
            }
        }
        
        if (isIsogram) {
            System.out.println(input + " is an isogram.");
        } else {
            System.out.println(input + " is not an isogram.");
        }
    }
}
