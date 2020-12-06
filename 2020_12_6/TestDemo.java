/**
 * 一些简单的Java练习
 */
import java.util.Scanner;

public class TestDemo {

    /**
     * 题目1：求出0～999之间的所有“水仙花数”并输出
     * “水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身
     * 如；153＝1＋5＋3?，则153是一个“水仙花数“
     */
    public static void main1(String[] args) {
        int i,j,k;
        int num;
        for(num = 100; num < 1000; num++){
            i = num / 100;
            j = (num / 10) % 10;
            k = num % 10;
            if(i * i * i + j * j * j + k * k * k == num) {
                System.out.print(num + " ");
            }
        }

    }

    /**
     * 题目2：计算分数的值
     * 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
     */
    public static void main2(String[] args) {
        double sum = 0.0;
        double j = -1;
        for (int i = 1; i <= 10;i++) {
            j =  j * (-1);
            sum =sum+ j/i;
        }
        System.out.println(sum);
    }

    /**
     * 题目3：求两个正整数的最大公约数
     */
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i > 0; i--) {
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("最大公约数为：" + i);
                break;
            }
        }
    }

    /**
     * 题目4：求一个整数，在内存当中存储时，二进制1的个数。
     */
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        while(num != 0){
            count ++;
            num = num & (num - 1);
        }
        System.out.println(count);
    }

    /**
     * 题目5：获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
     */
    public static void main5(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字：");
        int value=sc.nextInt();
        System.out.println("偶数序列：");
        for(int i = 31; i > 0; i -= 2) {
            System.out.print((value>>i)&1);
        }
        System.out.println("");
        System.out.println("奇数序列：");
        for(int i = 30;i >= 0;i -= 2){
            System.out.print((value>>i)&1);
        }
    }
    /**
     * 题目6：输出一个整数的每一位
     * 如：123的每一位是1 ， 2 ， 3
     */
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for (int count = 0; count < 4; count++) {
            int n = num % 10;
            num = num / 10;
            if(n <= 0){
                break;
            }
            System.out.println(n);
        }
    }
        /**
         * 题目7：输出n*n的乘法口诀表，n由用户输入
         */
        public static void main7(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.close();
            for(int i=1;i<=num;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print(j + "*" + i + "=" + j * i + " " );
                }
                System.out.println();
            }
        }
}

