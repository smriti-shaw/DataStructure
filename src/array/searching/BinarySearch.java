package array.searching;

public class BinarySearch {

    public Boolean binarySearch(int[] arr, int value, int start, int end){
        int mid = (start+end)/2;

        if(start >= end)
            return false;
        if(arr[mid] == value)
            return true;
        boolean leftResult = binarySearch(arr,value,start,mid-1);
        boolean rightResult = binarySearch(arr, value, mid+1, end);
        return (leftResult || rightResult);
    }

    public static void main(String[] args) {
        int[] input = {1,286,5,11,6,8,34,26,897};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(input, 897, 0, input.length-1));
    }
}
