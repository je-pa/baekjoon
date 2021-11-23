package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10809_numberOfAlphabets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] numOfAlphabets = new int[26]; //26='Z'-'A'+1
        for(int i=0; i<str.length() ; i++){
            numOfAlphabets[str.charAt(i)-97]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int n : numOfAlphabets){
            sb.append(n).append(' ');
        }System.out.println(sb);
    }
}
