import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;  // Pointer for the position to place non-val elements
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If nums[i] is not equal to val, copy it to nums[j]
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        // j now represents the number of elements in nums that are not equal to val
        return j;
    }
    
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        //input for nums
        System.out.print("Enter size of nums: ");
        int size = scanner.nextInt(); //read the size of nums from the user input
        int[] nums = new int[size];   //initialize an array nums with size "size"
        //read integers for nums array from user input
        System.out.println("Enter " + size + " integers for nums: ");
        for(int i = 0; i < size; i++){
            nums[i] = scanner.nextInt(); //read each integer and store in nums array
            
        }

        //input for Val
        System.out.print("Enter the value to remove (val): ");
        int val = scanner.nextInt(); //read the value 'val' to remove from nums

        //call removeElement to modify nums in-place and get the count of remaining elements
        int resultLength = removeElement(nums, val);

        //print out thr remaining elements after removal
        System.err.print("Remaining elements as array of integers: ");
        for (int i = 0; i < resultLength; i++){
            //print each remaininf elements in nums
            System.out.print(nums[i] + " "); 
        }
        System.out.println();
        //print the number of elements remaining (resultLength) after removal
        System.out.println("k (number of elements not equal to " + val + " ) : " + resultLength);

        //close the scanner object to free up resources
        scanner.close();
    }



}
