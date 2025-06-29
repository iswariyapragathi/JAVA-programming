import java.util.*;
public static void main(String [] args) {
    String s1 = "asdfghij";
    String s2 = "adsfgijh";
    int n = s1.length();
    
    for (int i = 0; i < n; i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
            int j = i;
            while (j < n && s1.charAt(j) != s2.charAt(j)) {
                System.out.print(s1.charAt(j));
                j++;
            }
            System.out.print("-");

            for (int k = i; k < j; k++) {
                System.out.print(s2.charAt(k));
            }

            System.out.println();

            i = j - 1; // move i forward to avoid rechecking the mismatch block
        }
    }
}
