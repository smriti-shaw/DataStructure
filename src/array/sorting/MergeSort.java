package array.sorting;

public class MergeSort {

    public int[] merge(int[] arr1, int[] arr2){
        int[] output = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]) {
                    output[k] = arr1[i];
                    i++;
                    k++;
                }else {
                    output[k] = arr2[j];
                    j++;
                    k++;
                }
            }
            while (i<arr1.length){
                output[k] = arr1[i];
                k++;
                i++;
            }
            while (j < arr2.length){
                output[k] = arr2[j];
                k++;
                j++;
            }
    return output;
    }

    public int[] mergeSort(int[] arr, int i, int j){
        int m = (i+j)/2;
        if(i == j) {
            int[] temp = {arr[i]};
            return temp;
        }
        int[] arr1 = mergeSort(arr, i , m );
        int[] arr2 = mergeSort(arr, m+1, j);
        return merge(arr1, arr2);

    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr1 = {1,99,76,8,8,113,4,234,6,9,654};
        int[] op = mergeSort.mergeSort(arr1,0,arr1.length-1);
        for(int i=0 ; i<op.length; i++){
            System.out.println(op[i]);
        }
    }

}
