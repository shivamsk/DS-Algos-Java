package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by siva on 11/5/16.
 * TODO
 */
public class FindDuplicatesInArray {

    private static List<Integer> findDuplicatesUsingExtraSpace(int input[]) {

        List<Integer> resultList = new ArrayList<Integer>();
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = 0;
        }

        for (int i = 0; i < input.length; i++) {
            array[input[i]]++;
        }

        for (int i = 0; i < input.length; i++) {
            if (array[input[i]] > 1) {
                resultList.add(input[i]);
            }
        }
        List<Integer> list = new ArrayList<>();


        return resultList;
    }

    private static List<Integer> findDuplicates(int input[]) {

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            System.out.println("Input : " + input[Math.abs(input[i])]);
            if (input[Math.abs(input[i])] > 0) {
                System.out.println(
                        "Changing i: " + i + " from input[Math.abs(input[i])] "
                                + input[Math.abs(input[i])]);
                input[Math.abs(input[i])] = -input[Math.abs(input[i])];
            } else {
                System.out.println("Adding " + Math.abs(input[i]));
                resultList.add(Math.abs(input[i]));
            }
        }

        return resultList;
    }

    public static void main(String[] args) {

        int[] array = {2, 4, 1, 2, 6, 1, 6, 3, 5};
        List<Integer> duplicates = findDuplicates(array);
        System.out.println(Arrays.toString(duplicates.toArray()));
    }
}
