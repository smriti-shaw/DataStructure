package array;

public class SubSet {

    // find continuous subset whose sum is given sum
    public static void main(String[] args) {
        int[] arr = {8,2,1,3,5,6,2,11,9,6};
        int sum = 13;

        int first = 0;
        int second = 0;
        int currentSum = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] == sum  ){
                first = i;
                second = i;
                i = arr.length;
            }

            else if((arr[i]+currentSum) == sum){
                second = i;
                i = arr.length;
            }

            else if((arr[i]+currentSum) < sum){
                currentSum += arr[i];
                second =i;
            }
            else {
                while((arr[i]+currentSum) > sum  && first <i){
                    currentSum = currentSum - arr[first];
                    first++;
                }
                if(currentSum+arr[i] == sum)
                {
                    second = i;
                    i = arr.length;
                }else {
                    first = i;
                    currentSum = arr[i];
                }
            }
        }
        System.out.println("first"+first);
        System.out.println("second"+second);
    }
}
