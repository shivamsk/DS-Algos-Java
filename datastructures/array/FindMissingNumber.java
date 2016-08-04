package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by siva on 11/5/16.
 */
public class FindMissingNumber {

    private static int findMissingNumber(int a[]){

        int start = 0;
        int end = a.length-1;

        while(start < end){
            int mid = (start+end)/2;
            if(a[mid] == mid + 1) {
                start = mid+1;
            }else{
                end = mid;
            }

        }

        return start+1;

    }

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        //System.out.println("Enter a number: ");
        int testCases = reader.nextInt(); // Scans th

        //System.out.println("Input "+testCases);
        while(testCases > 0){
            int size = reader.nextInt();
            int array[] = new int[size-1];
            int counter = 0;
            while(size-1>0){
                int element =  reader.nextInt();
                array[counter++] = element;
                size--;

            }
            System.out.println(findMissingNumber(array));
            //System.out.println("Array: "+ Arrays.toString(array));
            //System.out.println("Input "+n1);
            testCases--;
        }



    }
}
