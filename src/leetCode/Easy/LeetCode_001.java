package src.leetCode.Easy;

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//
//        你可以按任意顺序返回答案。


public class LeetCode_001 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums,target);
        System.out.print("[");
        for(int i = 0; i < result.length; i++){
            if(i == 0){
                System.out.print(result[i] + ",");
            }else {
                System.out.print(result[i]);
            }
        }
        System.out.print("]");
    }

    //暴力解法  2022/05/17
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i = 0;i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
