package src.leetCode.Easy;

/*
给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。

由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。
更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。

将最终结果插入 nums 的前 k 个位置后返回 k 。

不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

 */
public class LeetCode_026 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3}; // 输入数组
        //int[] expectedNums = new int[0]; // 长度正确的期望答案

        int length = removeDuplicates(nums); // 调用
        System.out.println(length);

    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int fast = 1;
        int slow = 0;
        while (fast < length){
            if (nums[slow] == nums[fast]){
                fast = fast + 1;
            }else if (fast == length){
                nums[slow+1] = nums[fast];
                slow = slow + 1;
            }else {
                nums[slow+1] = nums[fast];
                slow = slow + 1;
                fast = fast + 1;
            }
        }
        return slow + 1;

    }
}
