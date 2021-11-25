package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11655_ROT13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for(char c : str.toCharArray()){
            int plus13 = c+13;
            if(c>='a'&&c<='z'){
                c= (char)(plus13<='z' ? plus13 : plus13%'z'+'a'-1);
            }else if(c>='A'&&c<='Z'){
                c= (char)(plus13<='Z' ? plus13 : plus13%'Z'+'A'-1);
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
