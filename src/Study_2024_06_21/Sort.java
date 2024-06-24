package src.Study_2024_06_21;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        double [] nums = {12, 34, 56, 78, 23, 45, 67};
        //double[] bubbleSort = bubbleSort(nums);
        //System.out.println(Arrays.toString(bubbleSort));
        double[] choiceSort = choiceSort2(nums);
        System.out.println(Arrays.toString(nums));
    }

    //冒泡排序
    public static double [] bubbleSort(double[] nums){
        double temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        /*for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/

        return nums;
    }

    //选择排序
    public static double [] choiceSort(double[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    double temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;

    }

    //选择排序优化 记录较小值索引 每一轮只交换一次
    public static double [] choiceSort2(double[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                double temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;

            }
        }
        return nums;
    }
}
