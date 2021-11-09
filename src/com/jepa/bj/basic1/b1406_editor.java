package com.jepa.bj.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1406_editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> left = new Stack();
        Stack<String> right = new Stack<>();
        String[] strArr = br.readLine().split("");
        for(String s : strArr){
            left.push(s);
        }
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n ; i++){
            String str = br.readLine();
            switch (str.charAt(0)){
                case 'L':
                    if(!left.empty()) {
                        right.push(left.pop());
                    }
                    break;
                case 'D':
                    if(!right.empty()){
                        left.push(right.pop());
                    }
                    break;
                case 'B':
                    if(!left.empty()) left.pop();
                    break;
                case 'P':
                    left.push(Character.toString(str.charAt(2)));
                    break;
            }
        }
        while(!left.empty()){
            right.push(left.pop());
        }
        while(!right.empty()){
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
