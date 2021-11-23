package com.jepa.bj.basic1.dataStructure1;

import java.util.Scanner;

public class b17413_flipWord2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        boolean open = false;

        for(int i=0 ; i<str.length() ; i++ ){
            char c = str.charAt(i);
            if(open){
                if(c!='>'){
                    word.append(c);
                }else{
                    open = false;
                    result.append(word.append(c));
                    word.setLength(0);
                }
            }else if(c=='<'){
                open = true;
                word.append(str.charAt(i));
            }else{
                if(c!=' '){
                    word.insert(0,c);
                }else{
                    result.append(word.append(c));
                    word.setLength(0);
                }
            }
        }
        System.out.println(result.append(word));
    }
}
