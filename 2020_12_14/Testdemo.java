import java.util.Scanner;
/**
 * 递归练习
 */

public class Testdemo {
    /**
     * 练习一
     * 递归打印数字的每一位
     * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
     */
    public static void print(int n) {
        if(n>9){
            print(n/10);
        }
        System.out.println(n%10);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        print(num);
    }

    /**
     * 练习二
     * 递归求和
     * 递归求 1 + 2 + 3 + ... + 10
     */
    public static int add(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (add(n - 1) + n);
        }
    }
    public static void main2(String[] args) {
        int n = 10;
        int res = add(n);
        System.out.println(res);
    }

    /**
     * 练习三
     * 递归求 N 的阶乘
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }

}
