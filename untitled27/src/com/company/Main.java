package com.company;

public class Main {

    public static void main1(String[] args) {
	// write your code here
        //求平均数
        int [] arr={1,2,3,4,5,6};
        System.out.println(avg(arr));
    }

    public static double avg(int[] arr) {
        int sum =0;
        for(int x:arr){
            sum += x;
        }
        return(double)sum/(double)arr.length;
    }
}
