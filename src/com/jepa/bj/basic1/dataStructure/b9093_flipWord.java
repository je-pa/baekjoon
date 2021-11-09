package com.jepa.bj.basic1.dataStructure;
import java.util.Scanner;
public class b9093_flipWord {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            StringBuilder sb = new StringBuilder();
            scan.nextLine();
            for(int i=0 ; i<n ; i++){
                String str = scan.nextLine();
                StringBuilder sb2 = new StringBuilder();
                for(int j=0 ; j<str.length() ;j++){
                    char c = str.charAt(j);
                    if(c!=' '){
                        sb2.insert(0,c);
                    }else{
                        sb.append(sb2).append(c);
                        sb2.setLength(0);
                    }
                }sb.append(sb2).append('\n');
            }System.out.println(sb);
        }
}
