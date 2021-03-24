package com.jy.DS.Queue;

import org.junit.Test;

import java.util.Map;

/**
 * @description:
 * @author: Andy
 * @time: 2021/3/20 14:54
 */
public class Carwash {
    @Test
    public void test(){
        byte a = 1;
        short b = 3;
        float f = 1.223f;


        System.out.println(f);

        long l = 345524l;
    }

    @Test
    public void test1(){
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(binarySearch(2,arr));


    }

    public static int binarySearch(int key,int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int middle = start+(end-start)/2;
            if(key<arr[middle]) end = middle-1;
            else if(key>arr[middle]) start =middle+1;
            else return middle;
        }
        return -1;
    }

    @Test
    public void test01(){
        System.out.println((0+15.0)/2);
        System.out.println(true && false || true && true);
    }



}
