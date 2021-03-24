package com.jy.DS.Tree;

import org.junit.Test;

/**
 * @description:
 * @author: Andy
 * @time: 2021/3/20 22:25
 */
public class ArrayBinaryTreeDemo {




    @Test
    public void test01(){
        int[] arr ={1,2,3,4,5,6,7};

        ArrayBinatyTree arrayBinaryTreeDemo = new ArrayBinatyTree(arr);
        arrayBinaryTreeDemo.preOrder();
        System.out.println();
        arrayBinaryTreeDemo.infixOrder();
        System.out.println();
        arrayBinaryTreeDemo.postOrder();


    }

    class ArrayBinatyTree{

        private int[] arr;
        public ArrayBinatyTree(int[] arr){
            this.arr = arr;
        }

        public void preOrder(){
            this.preOrder(0);
        }
        public void infixOrder(){
            this.infixOrder(0);
        }
        public void postOrder(){
            this.postOrder(0);
        }



        public void preOrder(int index){
            if(arr ==null || arr.length==0){
                System.out.print("Array is Null");
            }

            System.out.print(arr[index]);
            if((index*2+1)<arr.length){
                preOrder(index*2+1);
            }
            if((index*2+2)<arr.length){
                preOrder(index*2+2);
            }

        }
        public void infixOrder(int index){
            if(arr ==null || arr.length==0){
                System.out.print("Array is Null");
            }
            if((index*2+1)<arr.length){
                infixOrder(index*2+1);
            }
            System.out.print(arr[index]);
            if((index*2+2)<arr.length){
                infixOrder(index*2+2);
            }
        }
        public void postOrder(int index){
            if(arr ==null || arr.length==0){
                System.out.print("Array is Null");
            }
            if((index*2+1)<arr.length){
                postOrder(index*2+1);
            }
            if((index*2+2)<arr.length){
                postOrder(index*2+2);
            }
            System.out.print(arr[index]);

        }



    }





}
