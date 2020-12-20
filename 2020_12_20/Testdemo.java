import java.util.Arrays;

public class Testdemo {
    /**
     * 练习1
     *  检查数组的有序性
     *  给定一个整型数组, 判断是否该数组是有序的(升序)
     */
    public static void main1(String[] args) {
        int[] arr = {1,2,3,10,5,6};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    /**
     * 练习2
     *  给定一个数组, 让数组升序 (降序) 排序
     *  每次尝试找到当前待排序区间中最小(或最大)的元素, 放到数组最前面(或最后面).
     */
    public static void main2(String[] args) {
        int[] arr = {9, 5, 2, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        // [0, bound) 构成了一个前闭后开区间, 表示已排序区间
        // [bound, length) 构成了一个前闭后开区间, 表示待排序区间
        // 每循环一次, 就找到一个合适大小的元素, 已排序区间就增大1.
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    int tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }
            }
        } // end for
    } // end bubbleSort

    /**
     * java中内置的排序算法使用
     * @param args
     */
    public static void main3(String[] args) {
        int[] arr = {9, 5, 2, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
