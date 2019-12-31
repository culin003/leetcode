package top.leoly.leetcode.array_remove_duplicate;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 6, 3, 4};
        int length = new Solution().removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.printf(nums[i] + " ");
        }

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 6, 3,4,4,4,4,4};
        length = new Solution().removeDuplicatesByCount(nums, 2);
        for (int i = 0; i < length; i++) {
            System.out.printf(nums[i] + " ");
        }
    }

    /**
     * <pre>
     *  给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     *
     * 示例 1:
     *
     * 给定数组 nums = [1,1,2],
     *
     * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     * 示例 2:
     *
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     *
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     * </pre>
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return 1;
        }

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }

    /**
     * <pre>
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     *
     * 示例 1:
     *
     * 给定 nums = [1,1,1,2,2,3],
     *
     * 函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     * 示例 2:
     *
     * 给定 nums = [0,0,1,1,1,1,2,3,3],
     *
     * 函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     * </pre>
     * @param nums
     * @param count
     * @return
     */
    public int removeDuplicatesByCount(int[] nums, int count) {
        if (nums.length <= count) {
            return count;
        }

        int index = 1;
        int duplicate = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
                duplicate = 0;
            } else {
                duplicate++;
                if (duplicate < count) {
                    nums[index++] = nums[i];
                }
            }
        }

        return index;
    }
}
