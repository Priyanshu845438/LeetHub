import java.util.*;

public class Solution {

    // Merge function to merge two sorted arrays
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; 
        int j = n - 1;
        int k = m + n - 1;

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.println("Enter size of the first array:");
        int m = sc.nextInt();
        int[] nums1 = new int[m + 200]; // Allocate extra space for nums2
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.println("Enter size of the second array:");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call merge function
        merge(nums1, m, nums2, n);

        // Output the merged array
        System.out.println("Merged array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
