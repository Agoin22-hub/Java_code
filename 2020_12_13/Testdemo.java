/**
 * 方法的练习
 */
import java.util.Scanner;
public class Testdemo {

    /**
     * 习题一
     * 斐波那契数（迭代）
     * 求斐波那契数列的第n项
     * 1 1 2 3 5 8 13 21 34
     * 1 2 3 4 5 6 7  8  9
     */
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字n：");
        int n = sc.nextInt();
        int res = 0;

        if(n==1||n==2){
            res = n;
        }
        int a=1;
        int b=1;
        for(int i = 3; i <= n; i++){
            res = a + b;
            a = b;
            b = res;
        }
        System.out.println(res);
    }

    /**
     * 习题二
     * 求最大值
     * 要求：创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
     * 在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     */
    public static int max2(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static int max3(int a, int b, int c) {
        int temp = max2(a,b);
        return max2(temp,c);
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字a：");
        int a = sc.nextInt();
        System.out.println("请输入一个数字b：");
        int b = sc.nextInt();
        System.out.println("请输入一个数字c：");
        int c = sc.nextInt();
        System.out.println(max3(a,b,c));
    }

    /**
     * 习题三
     * 斐波那契数（递归）
     */
    public static int fib(int n) {
        int fn = 0;
        if (n == 1 || n == 2) {
            fn = 1;
        } else {
            fn = fib(n - 1) + fib(n - 2);
        }
        return fn;
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fn = fib(n);
        System.out.println("斐波那契数列的第n项为：" + fn);
    }

    /**
     * 习题四
     * 返回的数字之和
     * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
     */
    //求一个正整数各位和
    public static int totalSum(int num){
        if (num < 10){
            return num;
        }
        return num % 10 + totalSum(num / 10);
    }

    public static void main4(String[] args) {
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = in.nextInt();
        sum = totalSum(num);
        System.out.println(sum);
    }
}
