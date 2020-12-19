public class Testdemo {

    /**
     * 练习1
     * 找查找数组中指定元素(顺序查找)
     */
    public static void main1(String[] args) {
        int[] arr = {1,2,3,10,5,6};
        System.out.println(find(arr, 10));
    }
    public static int find(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1; // 表示没有找到
    }
    /**
     * 练习2
     * 找查找数组中指定元素(二分查找)
     * 以升序数组为例, 二分查找的思路是先取中间位置的元素, 看要找的值比中间元素大还是小.
     * 如果小, 就去左边找;
     * 否则就去右边找
     */
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 6));
    }
    public static int binarySearch1(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                // 去左侧区间找
                right = mid - 1;
            } else if (toFind > arr[mid]) {

                // 去右侧区间找
                left = mid + 1;
            } else {
                // 相等, 说明找到了
                return mid;
            }
        }
        // 循环结束, 说明没找到
        return -1;
    }

    /**
     * 练习三
     * 比较二分查找的效率
     */
    static int count = 0; // 创建一个成员变量, 记录二分查找循环次数
    public static void main(String[] args) {
        int[] arr = makeBigArray();
        int ret = binarySearch(arr, 9999);
        System.out.println("ret = " + ret + " count = " + count);
    }
    public static int[] makeBigArray() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            count++; // 使用一个变量记录循环执行次数
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                // 去左侧区间找
                right = mid - 1;
            } else if (toFind > arr[mid]) {
                // 去右侧区间找
                left = mid + 1;
            } else {
                // 相等, 说明找到了
                return mid;
            }
            
        }
        // 循环结束, 说明没找到
        return -1;
    }


}
