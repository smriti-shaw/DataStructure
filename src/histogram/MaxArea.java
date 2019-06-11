package histogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Stack;

public class MaxArea {

    public static void main(String[] args) {
        int[] input = {1, 2, 3,1,4,5,7};
        Stack<Integer> stack = new Stack<>();
        int area = 0 ;
        int maxArea = -1;
        stack.push(0);
        int i;

        for(i =1; i<input.length;i++){

                while (input[stack.peek()] > input[i])
                {
                    int top = stack.pop();
                    if (stack.isEmpty())
                        area = input[top] * (i);
                    else {
                        int stackTop = stack.peek();
                        area = input[top] * ((i ) - stackTop - 1);
                    }
                }
                stack.push(i);

                if(area > maxArea) {
                    maxArea = area;
                    System.out.println("maxArea " +maxArea);

                }

            }

        while (!stack.isEmpty()){
            int top = stack.pop();
            if (stack.isEmpty())
                area = input[top] * (i);
            else{
                int stackTop = stack.peek();
                area = input[top] * ((i) - stackTop - 1);
            }
            if(area > maxArea)
                maxArea = area;
        }

        System.out.println("max area : "+maxArea);
    }
}
