package array;

/**
 * Created by siva on 10/5/16.
 */
public class MinLengthSubArraySum {

    private static void getMinLengthSubArraySum(int a[],int k ){
     if(null == a || a.length == 0){
         return ;
     }


     int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for(int i=0;i<=a.length-1;i++){
            int currentSum = 0;
            for(int j = i;j<=a.length-1 && (j-i+1)>min;j++){
                currentSum += a[j];
                if(currentSum == k){
                    minIndex =i;
                    maxIndex = j;
                    min = j-i+1;
                    break;
                }
            }

        }

        if(minIndex == -1 || maxIndex == -1){
            System.out.println("No Such subarray exists with sum :"+k);
        }

        while(minIndex <= maxIndex){
            System.out.println(a[minIndex++]);
        }


    }


}
