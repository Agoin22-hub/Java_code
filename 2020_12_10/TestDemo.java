/**
 * 方法的练习
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Arrays;

public class TestDemo {
    /**
     * 习题一
     * 找出出现一次的数字
     * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
     * @param args
     */

    public static Integer Find(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            int count = 1;//计数器
            for(int j = 0; j < arr.length; j++) {
                if(i == j)
                    continue;
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 1)
                return arr[i];
        }
        return null;
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1, str.length()-1);
        String[] s = str.split(",");
        int[] arr = new int[s.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(Find(arr));
    }


    /**
     * 习题二
     * 求阶乘和
     * 求求1！+2！+3！+4！+........+n!的和
     */

    public static int Fac(int i) {
        int mul = 1;
        for (int j = 1; j <= i; j++) {
            mul *= j;
        }
        return mul;
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字！");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += Fac(i);
        }
        System.out.println("阶乘之和为：" + sum);
    }

    /**
     * 习题三
     * 求 N 的阶乘
     */
    public static int Fac1(int num) {
        int mul = 1;
        for (int i = 1; i <= num; i++) {
            mul *= i;
        }
        return mul;
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        sc.close();
        System.out.println("N的阶乘为" + Fac1(num));
    }

    /**
     * 题目四
     * 奇数位于偶数之前
     * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
     */

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1, str.length()-1);
        String[] s = str.split(",");
        int[] arr = new int[s.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int len = arr.length;
        int i = len-1;
        while (i >= 0) {
            if ((arr[i] & 1) == 0) {
                i--;
                continue;
            }
            int curIdx = i;
            while (i >= 0 && (arr[i] & 1) == 1) {
                i--;
            }
            if (i >= 0 && (arr[i] & 1) == 0) {
                int tmp = arr[i];
                while (i < curIdx) {
                    arr[i] = arr[i+1];
                    i++;
                }
                arr[curIdx] = tmp;
            }
            i--;
        }
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
    }

}
