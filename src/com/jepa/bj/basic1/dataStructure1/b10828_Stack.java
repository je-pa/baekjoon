package com.jepa.bj.basic1.dataStructure1;
import java.util.ArrayList;
import java.util.Scanner;

public class b10828_Stack {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<a ; i++){
            switch(scan.next()){
                case "push":
                    list.add(scan.nextInt());
                    break;
                case "size":
                    sb.append(list.size()).append('\n');
                    break;
                case "empty":
                    sb.append(list.isEmpty()?1:0).append('\n');
                    break;
                case "top":
                    sb.append(list.isEmpty()?-1:list.get(list.size()-1)).append('\n');
                    break;
                case "pop":
                    if(list.isEmpty()){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(list.get(list.size()-1)).append('\n');
                        list.remove(list.size()-1);
                    }
                    break;
            }
        }System.out.println(sb);
    }
}
