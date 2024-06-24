package src.Study_2024_06_21;

public class Search {
    public static void main(String[] args) {
        int[] nums = {12, 23, 34, 45, 56, 67, 78, 89};
        System.out.println(binarySearch(nums, 78));
    }

    //二分查找
    public static int binarySearch(int[] nums, int data){
        int minIndex = 0;
        int maxIndex = nums.length - 1;
        int index = (minIndex+maxIndex)/2;

        while (minIndex <= maxIndex){
            if (data > nums[index]){
                minIndex = index + 1;
                index = (minIndex+maxIndex)/2;
            }else if (data < nums[index]){
                maxIndex = index - 1;
                index = (minIndex+maxIndex)/2;
            }else {
                return index;
            }
        }
        //不知道循环几次 用while
        /*for (int i = 0; i < nums.length / 2; i++) {

        }*/
        return -1;
    }

}
