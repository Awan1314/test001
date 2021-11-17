package com.example.random;

import java.util.Arrays;
import java.util.Random;
/*
    编写程序，生成5个不重复的随机数。重复的话重新生成。
    最终生威的5个随机数放到数组中，要求数组中这5个随机数不重复
*/

public class RandomTest02 {
    public static void main(String[] args) {
        int index = 0;
        // 创建随机数对象
        Random random = new Random();

        // 创建数组
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        while (index < arr.length){
            int num = random.nextInt(6);
            if (!contains(arr,num)){
                arr[index++] = num;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    /**
     * 单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
     * @param arr 数组
     * @param key 元素
     * @return true表示包舍, false表示不包含。
     */
    public static boolean contains(int[] arr, int key){
        /*
        这个方案有bug
        // 对数组进行升序
        Arrays.sort(arr);
        // 进行二分法查找
        return Arrays.binarySearch(arr,key) >= 0;*/

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
