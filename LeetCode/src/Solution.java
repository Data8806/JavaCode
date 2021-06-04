/**
 * @Author Data
 * @Date 2021-04-11
 * @Description LeetCode 解题
 */
public class Solution {
    /**
     * date : 2021-04-11
     *题目1 两数之和
     */

    public int[] twoSum(int [] nums, int target) {
        int a = 0;
        int b = 0;
        boolean c = false;
        for (int i = 0;  i< nums.length; i++) {
            if (c){break;}
            int n = nums[i];
            for (int j = i+1; j<nums.length;j++){
                if (n + nums[j] ==target){
                    c = false;
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        int [] r = new int[]{a,b};
        return r;
    }
    /**
     * @date ：2021-05-07
     * 1486. 数组异或操作
     */
    public int xorOperation(int n, int start) {
        int [] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = start + 2*i;
        }
        int r = nums[0];
        for (int i = 1;i<n;i++){
            r = r^nums[i];
        }
        return r;
    }

    /**
     * 9 回文数
     * @date:2021-05-12
     * @param x
     * @return
     * 整型转换为字符串的方法
     * 　　1.) String s = String.valueOf(i);
     *
     * 　　2.) String s = Integer.toString(i);
     *
     * 　　3.) String s = "" + i;
     *
     * 字符串颠倒方法
     *  1. 利用 StringBuffer 或 StringBuilder 的 reverse 成员方法:
     *  new StringBuilder(str).reverse().toString();
     *  2.  利用 String 的 toCharArray 方法先将字符串转化为 char 类型数组，然后将各个字符进行重新拼接:
     *  3. 利用 String 的 CharAt 方法取出字符串中的各个字符:
     */
    public boolean isPalindrome(int x) {
        // 整型转换为字符串
        String str1 = String.valueOf(x);
        String str2 =  new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);

    }
}
