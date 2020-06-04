package javaSubArray;

public class SubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int l = 0;
        int[] array = new int[n];
        while(n>0)
        {
            array[l] = scan.nextInt();
            l++;
            n--;
        }

        
    }
    
}