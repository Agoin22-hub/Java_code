import java.util.Arrays;

public class Testdemo {
    /**
     * 练习一 数组逆序
     * 给定一个数组, 将里面的元素逆序排列
     * 思路：
     * 设定两个下标, 分别指向第一个元素和最后一个元素. 交换两个位置的元素.
     * 然后让前一个下标自增, 后一个下标自减, 循环继续即可.
     */
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    /**
     * 练习二
     * 数组数字排列
     * 给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
     * 基本思路
     * 设定两个下标分别指向第一个元素和最后一个元素.
     * 用前一个下标从左往右找到第一个奇数, 用后一个下标从右往左找到第一个偶数, 然后交换两个位置的元素.
     * 依次循环即可.
     */
    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            // 交换两个位置的元素
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }


}
