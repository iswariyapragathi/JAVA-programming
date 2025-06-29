import java.util.*;
 class practice {
        public static void main(String[] args) {
        //merge the two sorted arr without duplicate
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2]; 
        int i = 0, j = 0, k = 0;
        int lastAdded = Integer.MIN_VALUE;
        while (i < n1 || j < n2) {
            int val;
            if (i < n1 && (j >= n2 || arr1[i] < arr2[j])) {
                val = arr1[i++];
            } else if (j < n2 && (i >= n1 || arr2[j] < arr1[i])) {
                val = arr2[j++];
            } else {
                val = arr1[i]; 
                i++;
                j++;
            }

            if (val != lastAdded) {
                result[k++] = val;
                lastAdded = val;
            }
        }

    
        System.out.print("Merged Unique Array: ");
        for (int x = 0; x < k; x++) {
            System.out.print(result[x] + " ");
        }
    }
