//Java program to print the pyramid pattern
//main class
public class PyramidPattern {
    //main driver method
    /**
     * @param args
     */
    public static void main (String[] args)
    {
        int num = 7;
        int x = 0;

        //outer loops for rows
        for (int i = 1; i<=num; i++){
            x = i-1;

            //Inner loop for "i"th row printing
            for (int j = i; j <= num-1; j++){
                
                //first number space
                System.out.print(" ");
                
                //space between numbers
                System.out.print(" ");
            }

            //Pyramid printing
            for (int j = 0; j <= x; j++)
            System.out.print((i + j) < 15 ? (i + j) + " " : (i +j) + " ");

            for (int j = 1; j <= x; j++)
            System.out.print((i + x - j) < 15 ? (i + x - j) + " " : (i + x - j) + " ");

            // By now we reach end for one row, so
            // new line to switch to next
            System.out.println();
        }
    }
}