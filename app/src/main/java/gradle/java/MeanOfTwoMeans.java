package gradle.java;

import static java.util.Arrays.copyOfRange;

public class MeanOfTwoMeans {
    public static int[] get_mean(int[] arr, Integer x, Integer y) {

        int[] new_array = copyOfRange(arr, 0, 1);
        return new_array;

        /*var firstMedia = 0;
        var secondMedia = 0;

        for (int i = 0; i <= arr[1]; i++) {
            firstMedia = (arr[0] + arr[1]) / x;
        }

        for (int j = 0; j <= arr.length; j++) {
            secondMedia = (arr[3] + arr[2] + arr[1]) / y;
        }


        if (y <= arr.length && x <= arr.length && y > 1 && x > 1){
            return firstMedia + secondMedia / 2;
        } else return -1;
        */
    }

}

// mean of the first 2 elements of the array is (1+3) / 2 = 2
// mean of the last 3 elements of the array is (4+2+3) / 3=3

// the mean of two is (2 + 3) / 2 = 2.5