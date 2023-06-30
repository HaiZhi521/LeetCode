package src.leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

//冒泡排序
//1.比较数组中两个相邻的元素，如果第一个数大于第二个数，交换它们位置
//2.每一次比较，都会产生一个最大或最小的数字(升序为最大数)
//3.下一轮则可以少一次排序
//4.依次循环，直到结束
//当我们看到嵌套循环，应该立马就可以得出这个算法的时间复杂度为O(n2)。

public class BubbleSort {
    public static void main(String[] args) {
        int[] numList ={2,5,8,1,4,7,3,6,9};
        bubbleSort(numList);
        //System.out.println(Arrays.toString(bubbleSort(numList)));
    }
    public static int [] bubbleSort(int [] num){
        int[] numSort = num;
        for (int i = 0;i < numSort.length - 1;i++){
            for (int j = 0;j < numSort.length - 1;j++){
                int number;
                if(numSort[j] > numSort[j+1]){
                    number = numSort[j];
                    numSort[j] = numSort[j+1];
                    numSort[j+1] = number;
                    System.out.println(Arrays.toString(numSort));
                }

            }
        }
        return numSort;
    }
}
