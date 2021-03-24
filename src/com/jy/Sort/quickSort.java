package com.jy.Sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @description:
 * @author: Andy
 * @time: 2021/3/19 9:21
 */
public class quickSort {


    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);

    }

    public static void quickSort(int[] arr, int start ,int end){
        if(start>=end) return;

        int middle = partition(arr,start,end);
        quickSort(arr,start,middle-1);
        quickSort(arr,middle+1,end);





    }

    public static int partition(int[] arr,int start,int end){

        int pivot = arr[start];

        int left = start + 1;
        // 右边界
        int right = end;
        while (left < right) {
            // 找到第一个大于基数的位置
            while (left < right && arr[left] <= pivot) left++;
            // 交换这两个数，使得左边分区都小于或等于基数，右边分区大于或等于基数
            if (left != right) {
                exchange(arr, left, right);
                right--;
            }
        }
        // 如果 left 和 right 相等，单独比较 arr[right] 和 pivot
        if (left == right && arr[right] > pivot) right--;
        // 将基数和中间数交换
        if (right != start) exchange(arr, start, right);
        // 返回中间值的下标
        return right;

    }
    private static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int partition1(int[] arr,int start,int end){
        int pivot = arr[start];
        int left = start+1;
        int right = end;

        while(left<right){
            while(left<right && arr[left]<= pivot) left++;
            while (left<right&& arr[right]>= pivot) right++;
            if(left<right){
                exchange(arr,left,right);
            }
        }
        if(left == right && arr[right]>pivot) right--;
        exchange(arr,start,right);
        return right;

    }

    @Test
    public void test(){
        int[] arr = new int[]{1,3,2,9,4,32};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }








}
