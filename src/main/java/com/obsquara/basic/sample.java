package com.obsquara.basic;

public class sample {
    public static void main(String args[])
    {
        System.out.println("hello");
        int sum = 0;
        for(int i=1; i<=15; i++){
            if(i%2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
