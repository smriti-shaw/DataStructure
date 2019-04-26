package array.searching;

public class LinearSearch {

    public Boolean linearSearch(int[] arr, int value){
        for( int i=0; i< arr.length; i++){
            if(arr[i] == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1,286,5,11,6,8,34,26,897};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.linearSearch(input, 897));
    }
}
