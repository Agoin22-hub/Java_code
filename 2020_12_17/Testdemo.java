import java.util.Scanner;

/**
 * 数组的练习
 */
public class Testdemo {
    /**
     * 练习一
     * 打印数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);
    }

    /**
     * 练习二
     * 创建的数组，并且赋初始值
     * 创建一个 int 类型的数组, 元素个数为 100
     * 并把每个元素依次设置为 1 - 100
     */
    public static void main2(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int x : arr) {
            System.out.println(x);
        }

    }

    /**
     * 练习三
     * 数组转字符串
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }

}
