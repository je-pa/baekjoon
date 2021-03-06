package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1918_postfix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i);
            switch (c){
                case '+': case '-': case '*': case '/':
                    while(!st.empty()&& Priority(c)<=Priority(st.peek())){
                        sb.append(st.pop());
                    }st.push(c);
                    break;
                case '(':
                    st.push(c);
                    break;
                case ')':
                    while(!st.empty()){
                        if(st.peek()!='('){
                            sb.append(st.pop());
                        }else{
                            st.pop();
                            break;
                        }
                    }
                    break;
                default:
                    sb.append(c);
            }
        }
        while (!st.empty()){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
    static int Priority(char c){
        switch (c){
            case '(':
                return 0;
            case '+': case '-':
                return 1;
            default:
                return 2;
        }
    }
}
