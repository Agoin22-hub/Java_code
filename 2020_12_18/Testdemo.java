/**
 * 对于数组的基本操作练习
 */

import java.util.Arrays;
public class Testdemo {
    /**
    * 练习1
    * 实现一个自己版本的数组转字符串
    */

    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            // 借助 String += 进行拼接字符串
            ret += arr[i];
            // 除了最后一个元素之外, 其他元素后面都要加上 ", "
            if (i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    /**
     * 练习2
     * 实现 数组拷贝
     */
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("newArr: " + Arrays.toString(newArr));
        arr[0] = 10;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newArr));
        // 拷贝某个范围.
        int[] newArr2 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("newArr2: " + Arrays.toString(newArr2));
    }

    /**
     * 练习3
     * 找数组中的最大元素
     */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(max(arr));
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}

