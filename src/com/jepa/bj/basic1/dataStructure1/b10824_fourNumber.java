package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10824_fourNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        System.out.println(Long.parseLong(arr[0]+arr[1])+Long.parseLong(arr[2]+arr[3]));
    }
}
