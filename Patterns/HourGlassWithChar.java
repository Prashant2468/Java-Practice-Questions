/*
 * Definition : Print The Following HourGlassPattern
          A B C D E F G H I 
            A B C D E F G 
              A B C D E 
                A B C 
                  A 
                A B C 
              A B C D E 
            A B C D E F G 
          A B C D E F G H I 

 */
public class HourGlassWithChar {

    public static void main(String[] args) {
        int n = 9; // Number of characters in the widest row

        // Upper part of the pattern
        for (int i = n; i >= 1; i -= 2) {
            printSpaces((n - i) / 2); // Adding spaces for centering
            printAlphabets(i);
        }

        // Lower part of the pattern
        for (int i = 3; i <= n; i += 2) {
            printSpaces((n - i) / 2); // Adding spaces for centering
            printAlphabets(i);
        }
    }

    // Method to print spaces for alignment
    public static void printSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print("  "); // Two spaces for better alignment
        }
    }

    // Method to print alphabets
    public static void printAlphabets(int count) {
        for (char ch = 'A'; ch < 'A' + count; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(); // Move to the next line
    }
}
