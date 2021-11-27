package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2609_GreatestCommonFactorLeastCommonMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int gcf=greatestCommonFactor(arr[0],arr[1]);
        System.out.println(gcf+"\n"+arr[0]/gcf*arr[1]);
    }
    static int greatestCommonFactor(int x, int y){
        if(x == 0 ) return y;
        else return greatestCommonFactor(y%x,x);
    }
}
