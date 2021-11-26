package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b11656_suffixArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n=str.length();
        String[] strArr = new String[n];
        for(int i=0; i<n ; i++){
            strArr[i]=str.substring(i,n);
        }
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for(String s : strArr){
            sb.append(s).append('\n');
        }System.out.println(sb);
    }
}
