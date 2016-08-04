package array;

import java.util.Arrays;

/**
 * Created by siva on 11/5/16.
 * http://www.ideserve.co.in/learn/re-arrange-elements-to-put-positive-negative-elements-in-alternate-order
 */
public class RearrangePositiveAndNegative {

    private static boolean isItAtRightPosition(int a[],int m){
        if(m % 2 == 0){
            if(a[m] >0 ) return true;

            return false;
        }else {
            if(a[m] >0 ) return false;

            return true;
        }
    }

    private static int findNextOppositeElementIndex(int a[],int m){
        for(int i=m+1;i<a.length;i++){
            if(a[m]*a[i]<0) return i;
        }

        return -1;
    }

    private static void shiftArray(int a[],int start,int end){
        int lastElement = a[end];
        for(int i=end;i>start;i--){
            a[i]=a[i-1];
        }
        a[start] = lastElement;
    }

    private static void rearrangePositivesAndNegatives(int a[]){
        if(null == a || a.length == 0){
            return ;
        }

        for(int i =0;i<a.length;i++){
            if(isItAtRightPosition(a,i)) continue;

            int nextElementIndex = findNextOppositeElementIndex(a,i);
            if(nextElementIndex == -1) break;

            shiftArray(a,i,nextElementIndex);

        }


    }

    public static void main(String args[]){
        int[] testArray = {-1,3,2,4,5,-6,7,-9};
        rearrangePositivesAndNegatives(testArray);
        System.out.println("After Rearranging "+ Arrays.toString(testArray));
    }
}
