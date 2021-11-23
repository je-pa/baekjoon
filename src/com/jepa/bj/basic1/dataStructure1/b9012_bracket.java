package com.jepa.bj.basic1.dataStructure1;
import java.util.Scanner;
/*9012 괄호*/
public class b9012_bracket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<n ; i++){
            String str = sc.next();
            int result=0;
            for(int j=0 ; j<str.length() ; j++){
                result += str.charAt(j)=='(' ? 1 : -1 ;
                if(result<0) break;
            }
            sb.append(result==0?"YES":"NO").append('\n');
        }
        System.out.print(sb);
    }
}
