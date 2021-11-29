package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1978_findDecimals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int max = arr[N-1];
        int[] decimalsArr = new int[max+1];
        decimalsArr[0]=-1;
        decimalsArr[1]=-1;
        for(int i=2 ; i<max+1 ; i++){
            if(decimalsArr[i]==0) {
                for (int j = i * 2; j < max + 1; j += i) {
                    decimalsArr[j] = -1;
                }
            }
        }
        int count = 0;
        for(int x:arr){
            if(decimalsArr[x]==0)count++;
        }
        System.out.println(count);
    }
}
