package backtracking;

public class ShortestPath {

    public static void main(String[] args) {

        int[][] input = {{3,1,5},{6,11,17},{2,9,4}};
        ShortestPath shortestPath = new ShortestPath();
        System.out.println(shortestPath.findmin(2,2,0,input));
    }

    private int minimum(int a, int b, int c){

        if(a<=b && a<=c)
            return a;
        else if(b<=a && b<=c)
            return b;
        return c;
    }

    private int findmin(int i, int j, int sum, int[][] input){

        if(i==0 && j==0) {
            sum +=input[i][j];
            return (sum);
        }
        if(i<0 || j<0) {
            return 9000000;
        }
        sum +=input[i][j];
        return   minimum(findmin(i-1,j-1,sum,input),
                findmin(i,j-1,sum,input),
                findmin(i-1,j,sum,input));

    }
}
