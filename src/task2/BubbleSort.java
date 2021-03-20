package task2;

import java.util.concurrent.Callable;

public class BubbleSort implements Callable<String> {

    private int [] myList;

    public BubbleSort(int[] myList) {
        this.myList = myList;
    }

    public void bubleSort(){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;

            for (int i = 0; i < myList.length; i++) {
                if (myList[i]> myList[i+1]){
                    temp=myList[i];
                    myList[i]=myList[i+1];
                    myList[i+1]=temp;
                    sorted=false;
                }
            }
        }




    }

    @Override
    public String call() throws Exception {
        bubleSort();
        return "Bubble is first";
    }
}
