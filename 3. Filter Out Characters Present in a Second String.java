import java.util.*;
 class practice {
 public static void main(String[] args) {
 String s1 = "expErIence";
        String s2 = "En";
        StringBuilder s3 = new StringBuilder(); 
        // Iterate through each character in s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean found = false;

            // Check if c is in s2 by manually checking each character of s2
            for (int j = 0; j < s2.length(); j++) {
                if (c == s2.charAt(j)) {
                    found = true; // Character is found in s2
                    break; // No need to check further, break out of the inner loop
                }
            }
            // If the character was not found in s2, add it to s3
            if (!found) {
                s3.append(c);
            }
        }
        // Print the modified string
        System.out.println("Output: " + s3.toString());
        
        }
        }
