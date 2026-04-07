package chapter7;

import java.util.*;
public class Example7_6 {
    public static void main(String args[]) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(1);
        int k=1;
        while(k<=10) {
            int f1=stack.pop();
            int f2=stack.pop();
            int temp=f1+f2;
            System.out.print(temp+"  ");
            stack.push(temp);
            stack.push(f2);
            k++;
        }
    }
}
