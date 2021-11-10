package com.jepa.bj.basic1.dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class b1158_josephus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int N = scan.nextInt();
        for(int i =1 ; i<=N ; i++){
            list.add(i);
        }

        int K = scan.nextInt();
        int index = K-1;
        StringBuilder sb = new StringBuilder("<"+list.remove(index));

        while(!list.isEmpty()){
            index = (index + K -1)%list.size();
            sb.append(", ").append(list.remove(index));
        }
        sb.append(">");
        System.out.println(sb);
    }
}
