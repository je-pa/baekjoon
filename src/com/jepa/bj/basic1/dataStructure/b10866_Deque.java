package com.jepa.bj.basic1.dataStructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
//덱
public class b10866_Deque {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scan.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0 ; i<N ; i++){
            String str = scan.next();
            switch (str){
                case "push_front":
                    dq.addFirst(scan.nextInt());
                    break;
                case "push_back":
                    dq.addLast(scan.nextInt());
                    break;
                case "pop_front":
                    sb.append(dq.isEmpty()?-1:dq.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(dq.isEmpty()?-1:dq.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty":
                    sb.append(dq.isEmpty()?1:0).append("\n");
                    break;
                case "front":
                    sb.append(dq.isEmpty()?-1:dq.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(dq.isEmpty()?-1:dq.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
