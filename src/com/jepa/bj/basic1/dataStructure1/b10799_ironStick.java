package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10799_ironStick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = 0;
        int sum = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)=='('){
                if(str.charAt(i+1)=='('){
                    n++;
                }else{
                    sum+=n;
                    i++;
                }
            }else{
                sum+=1;
                n--;
            }
        }
        System.out.println(sum);
    }
}
