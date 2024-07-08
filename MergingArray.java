import java.util.Scanner;

public class MergingArray {
   
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;    // Index of last element in nums1 (pointer for nums1)
        int j = n - 1;    // Index of last element in nums2
        int k = m + n - 1;  // Index of last element in merged nums1

         // Merge nums2 into nums1 in descending order
        while(j >= 0){
            // nums1[k--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
                else {
                    nums1[k--] = nums2[j--];
                }
                
                }

            }
        
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
            // Input for nums1
            System.out.print("Enter size of nums1: ");
            int m = scanner.nextInt();
            int[] nums1 = new int[m];
            System.out.println("Enter " + m + " integers for nums1:");
            for (int i = 0; i < m; i++) {
                nums1[i] = scanner.nextInt();
            }
    
            // Input for nums2
            System.out.print("Enter size of nums2: ");
            int n = scanner.nextInt();
            int[] nums2 = new int[n];
            System.out.println("Enter " + n + " integers for nums2:");
            for (int i = 0; i < n; i++) {
                nums2[i] = scanner.nextInt();
            }
    
            // Merge arrays
            merge(nums1, m, nums2, n);
    
            // Print merged nums1
            System.out.print("Merged Array: ");
            for (int num : nums1) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            scanner.close();
        }
    }
    
