import java.util.Scanner;

/**
 * 数组的练习
 */
public class Textdemo {
    /**
     * 练习一
     * 数组所有元素之和
     * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和
     */

    public static int sum(int[] arr) {
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        return add;
    }
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res = sum(arr);
        System.out.println(res);
    }

    /**
     * 练习二
     * 求数组的平均值
     * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值
     * (注意方法的返回值类型)
     */
    public static double avg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double res = avg(arr);
        System.out.println(res);
    }

    /**
     * 改变原有数组元素的值
     * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2
     * 并设置到对应的数组元素上
     * 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
     */
    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        transform(arr);
        printArray(arr);
    }
}
