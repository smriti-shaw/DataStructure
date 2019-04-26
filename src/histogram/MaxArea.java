package histogram;

import java.util.Stack;

public class MaxArea {



    public static void main(String[] args) {
        int[] input = {1, 2, 3, 7, 1, 2, 5};
        Stack<Integer> stack = new Stack<>();
        int area ;
        int maxArea = -1;
        int stackTop = 0;

        for(int i=0; i<input.length;i++){
            if(stack.isEmpty())
            {
                stack.push(i);
                stackTop++;
            }
            else {
                System.out.println("max area"+maxArea);
                System.out.println("top ele inside loop"+stack.peek());
                if (input[stack.peek()] > input[i]) ;
                {
                    int top = stack.pop();
                    System.out.println("top inside loop"+top);
                    if (stack.isEmpty())
                        area = input[top] * i;
                    else
                        area = input[top] * (i - stackTop - 1);
                }
                if(area > maxArea)
                    maxArea = area;
                stack.push(i);
                stackTop++;
            }
        }

        int j=1;
        System.out.println("stacktop"+stackTop);
        System.out.println("size"+stack.size());
        while (!stack.isEmpty()){
            System.out.println("stack top "+stack.peek());
            int top = stack.pop();
            if (stack.isEmpty())
                area = input[top] * j;
            else
                area = input[top] * (j - stackTop - 1);
            if(area > maxArea)
                maxArea = area;
        }

        System.out.println("max area : "+maxArea);
    }
}
