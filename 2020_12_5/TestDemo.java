/**
 * 一些简单的java练习题
 */

import java.util.Scanner;
import java.util.Random;

public class TestDemo {

    /**
     * 题目1：数字 9 出现的次数
     * 编写程序数一下 1到 100 的所有整数中出现多少个数字9
     * 9 19 29 39 49 59 69 79 89 90
     * @param args
     */
    public static void main1(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 9 || i / 10 == 9){
                count++;
                if(i % 10 == 9 && i / 10 == 9){
                    count++;
                }
            }
        }
        System.out.println("在1到100的所有整数中出现的次数为" + count);
    }

    /**
     * 题目2：输出 1000 - 2000 之间所有的闰年
     * 闰年是能被4整除，不能被100整除，但是能被400整除
     * @param args
     */
    public static void main2(String[] args) {
        for (int i = 1000; i < 2000; i++) {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0 ){
                System.out.println(i);
            }
        }
    }

    /**
     * 题目3：打印 1 - 100 之间所有的素数
     * @param args
     */
    public static void main3(String[] args) {
        for (int i = 1; i < 100; i++) {
            int j = 0;
            for(j = 2; j < i - 1;j++){
                if(i % j == 0){
                    break;
                }
            }
            if(j >= i - 1){
                System.out.println(i);
            }
        }
    }

    /**
     * 题目4：给定一个数字，判定一个数字是否是素数
     * @param args
     */
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个你想要判断的数");
        int num = sc.nextInt();
        sc.close();
        int i = 0;
        for (i = 2; i < num - 1; i++) {
            if(num % i == 0){
                System.out.println("这个数不是素数！");
                break;
            }
        }
        if(i >= num - 1){
            System.out.println("这个数是素数！");
        }
    }

    /**
     * 题目5：根据输入的年龄, 来打印出当前年龄人的阶段
     * 少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
     * @param args
     */
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        sc.close();
        if(age <= 18) {
            System.out.println("你正是少年！");
        } else if(age > 18 && age <=28){
            System.out.println("你是青年！");
        }else if(age > 29 && age <=55){
            System.out.println("你是中年！");
        }else{
            System.out.println("你是老年！");
        }
    }

    /**
     * 题目6：多组输入，一个整数（2~20）
     * 表示输出的行数，也表示组成“X”的反斜线和正斜线的长度
     * 对每行输入，输出用“*”组成的X形图案
     */
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(j == i || j == num - 1 -i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     *题目7：猜数字小游戏
     */
    public static void main(String[] args) {
        Random random = new Random(); // 默认随机种子是系统时间
        Scanner sc = new Scanner(System.in);
        int tag = random.nextInt(100);
        // System.out.println("toGuess: " + toGuess);
        while (true) {
            System.out.println("请输入要输入的数字: (1-100)");
            int num = sc.nextInt();
            if (num < tag) {
                System.out.println("低了!");
            } else if (num > tag) {
                System.out.println("高了!");
            } else {
                System.out.println("恭喜你，猜对了!");
                break;
            }
        }
        sc.close();
    }

}
