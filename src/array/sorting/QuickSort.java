package array.sorting;

public class QuickSort {

    public int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public void quickSort(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {30,80,40,90,10,50,70};
        quickSort.quickSort(arr, 0,arr.length-1);
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
