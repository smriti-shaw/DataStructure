package array.sorting;

public class InsertionSort {

    public void insertionSort(int[] arr){
        for(int i=1; i< arr.length; i++){
            int key = arr[i];
            int j= i-1;
            while( j>=0 && arr[j] > key ){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {9,4,1,7,11,5,23,19};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(input);
        for(int i=0 ; i<input.length ; i++){
            System.out.println(input[i]);
        }
    }
}
