package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class IntersectionSort implements Callable<String> {

    private int[] myList;

    public IntersectionSort(int[] myList) {
        this.myList = myList;
    }

    private void intersectionSort() {
        for (int i = 1; i < myList.length ; i++) {
            int temp = myList[i];
            int j= i-1;

            while (j>=0 && temp< myList[j]){
                myList[j+1] = myList[j];
                j--;
            }
            myList[j+1]=temp;
        }
    }


    @Override
    public String call() throws Exception {
        intersectionSort();
        return "Intersection was first";
    }


}
