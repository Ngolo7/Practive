import java.util.Scanner;

public class RemoveDuplicates {
    //method to remove duplicates from sorted arrays nums and return the count of qnique elemnts
    public static int removeDuplicates(int[] nums) {
        //check if affay is empty
        if(nums.length == 0){
        return 0; //return 0 if empty
        }

        int k = 1; //Pointer for the position of unique elements

        //Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++){
            //if current element is different from the previous unique element
            if (nums[i] != nums [k - 1]){
                //copy the current element to the next position of unique elements
                nums[k++] = nums[i];
            }
        }
        return k; //return the number of unique elemnts
        
    }

    public static void main(String[] args) {
        //create a a scanner object to read inout
        Scanner scanner = new Scanner(System.in);

        //input for nums
        System.out.print("Enter size of nums: ");
        int size = scanner.nextInt(); //read the size of nums from user
        int[] nums = new int[size];   // initialize nums array with size 'size'

        //enetr integers for num(sorted in non-decreasing order)
        System.out.println("Enter " + size + " integers for nums (sorted in non-decreasing order): ");
        for (int i = 0; i< size; i++){
            nums[i] = scanner.nextInt(); //read each integer input and store in nums array
        }

        //call removeDuplicates method to modify nums in-place and get the count of unique elements
        int k = removeDuplicates(nums);

        //print the unique elements in nums
        System.out.print("Unique elements in ums: ");
        for (int i = 0; i < k; i++){
            System.out.print(nums[i] + " "); // print each unique elements
        }
        System.out.println();

        //print the number of unique elements (k)
        System.out.println("Number of unique elemnts: " + k);
        scanner.close(); //close the scanner object to free resources
    }
    
}
