package task2;

import java.util.*;
import java.util.concurrent.*;

public class SortThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Random random = new Random();
        int[] array1 = new int[10000];
        int[] array2 = new int[10000];


        for (int i = 0; i < 10000; i++) {
            array1[i] = random.nextInt(300);
            array2[i] = array1[i];
        }


        ExecutorService executor = Executors.newFixedThreadPool(2);

        String result = executor.invokeAny(Arrays.asList(
                new BubbleSort(array1),
                new IntersectionSort(array2)

        ));
        System.out.println(result);
        executor.shutdown();


    }

}
