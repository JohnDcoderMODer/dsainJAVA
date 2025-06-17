public class CharRepeatedInString {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();
        boolean hasRepeatedChar = false;

        java.util.Map<Character, Integer> charCount = new java.util.HashMap<>();
        for (char c : characters) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (java.util.Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' repeated " + entry.getValue() + " times.");
                hasRepeatedChar = true;
            }
        }
        if (!hasRepeatedChar) {
            System.out.println("No repeated characters found.");
        }

    }
}
