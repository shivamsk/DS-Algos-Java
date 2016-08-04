package array;

import java.util.Scanner;

/**
 * Created by siva on 11/5/16.
 */
public class FindNextGreaterNumber {


    private static String findNextGreaterNumber(String n){
        int  length = n.length();
        if(length == 1) return "not possible";
        int counter = 0;
        int ascendingCounter = 0;
        for(int i=1;i<length;i++){
            if(n.charAt(i) < n.charAt(i-1)) counter++;
            else if(n.charAt(i) > n.charAt(i-1)) ascendingCounter++;

        }

        // Case 1: All are in descending order. No Greater number exists in this case.
        if(counter == length -1){
            return "not possible";
        }

        char[] charArray = n.toCharArray();

        // Case 2: All are in ascending order. Swap last two digits.
        if(ascendingCounter == length -1){
            char lastDigit = charArray[length-1];
            charArray[length-1]=charArray[length-2];
            charArray[length-2]=lastDigit;
            return new String(charArray);
        }

        char lastElement = charArray[length-1];
        int requiredIndex = -1;
        for(int i=length-2;i>=0;i--){
            if(charArray[i] < lastElement ){
                requiredIndex = i;
                break;
            }
        }
        if(requiredIndex == -1) return "not possible";

        charArray[length-1]=charArray[requiredIndex];
        charArray[requiredIndex]=lastElement;

        // Now sort the elements after requiredIndex+1 till the end. They are already in reverese sorted manner.
        // Just reversing would do the trick.
        reverseArray(charArray,requiredIndex+1,length-1);

        return new String(charArray);



    }

    private static void reverseArray(char[] a,int start,int end){
        while(start<end){
            char temp = a[start];
            a[start]= a[end];
            a[end]=temp;
        }
    }

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        //System.out.println("Enter a number: ");
        int testCases = reader.nextInt(); // Scans th

        //System.out.println("Input "+testCases);
        while(testCases > 0){
            int n1 = reader.nextInt();
            System.out.println(findNextGreaterNumber(String.valueOf(n1)));
            //System.out.println("Input "+n1);
            testCases--;
        }



    }
}
