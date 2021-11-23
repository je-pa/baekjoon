package com.jepa.bj.basic1.dataStructure1;
import java.util.Stack;
import java.util.Scanner;

public class b1874_stackSequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int len = scan.nextInt();
        int n = len;
        int[] arr = new int[len];
        Stack<Integer> stack = new Stack<>();

        for(int i=len-1 ; i>=0 ; i--){
            arr[i] = scan.nextInt();
        }
        for(int i=0 ; i<len ; i++){
            stack.push(arr[i]);
            sb.insert(0,"-\n");
            n=findN(n,stack,sb);
        }
        if(stack.empty()) {
            System.out.print(sb);
        }else{
            System.out.println("NO");
        }
    }
    public static int findN(int n, Stack<Integer> stack, StringBuilder sb){
        if(!stack.empty() && stack.peek()==n){
            stack.pop();
            sb.insert(0,"+\n");
            n = findN(--n,stack,sb);
        }
        return n;
    }
}
