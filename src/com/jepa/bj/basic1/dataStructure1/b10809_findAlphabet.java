package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10809_findAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] indexOfAlphabets = new int[26]; //26='Z'-'A'+1
        for(int i=0 ; i<26 ; i++){
            indexOfAlphabets[i]=-1;
        }

        for(int i=str.length()-1; i>=0 ; i--){
            indexOfAlphabets[str.charAt(i)-'a']=i;
        }

        StringBuilder sb = new StringBuilder();
        for(int n : indexOfAlphabets){
            sb.append(n).append(' ');
        }System.out.println(sb);
    }
}
