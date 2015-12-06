package c4q.lighterletter;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by c4q-john on 12/3/15.
 * I was over-complicating things before. I got this in about 5 minutes.
 *
 */
public class Main {

    public static void main(String[] args) {

        int[] array = new int[101];
        for (int i = 0; i < 101; i++) {
            array[i] = i;
        }
        int randNum = ThreadLocalRandom.current().nextInt(0,101);
        array[randNum] = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]){
                System.out.println(array[i] +1);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}