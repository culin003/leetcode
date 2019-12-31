package top.leoly.leetcode.array_zero_move;

/**
 * <pre>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        for (int num : nums) {
            System.out.printf(num + " ");
        }
    }

    public void moveZeroes(int[] nums) {
        // 找出不是0的元素位置
        int index = 0;
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            } else {
                zeroIndex++;
            }
        }

        for (int i = 0; i < zeroIndex; i++) {
            nums[index++] = 0;
        }
    }
}
