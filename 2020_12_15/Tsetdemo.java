import java.util.Scanner;

/**
 * 方法的重载
 */
public class Tsetdemo {
    /**
     * 求最大值方法的重载
     * 在同一个类中定义多个方法：
     * 要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     */
    public static void main1(String []args)
    {
        int max1 = max(5,10);
        float max2 = max(6.0f,8.2f);
        float max3 = max(3.2f,5.4f,6);
        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
        System.out.println("max3 = " + max3);
    }
    public static int max(int x, int y) {
        return x>y?x:y;
    }
    public static float max(float x, float y) {
        return x>y?x:y;
    }
    public static float max(float x,float y,int z) {
        return max(x,y)>z?max(x,y):z;
    }

    /**
     * 求和的重载
     * 在同一个类中,分别定义求 两个整数的方法 和 三个小数之和的方法
     * 并执行代码，求出结果
     */
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }

    static int add(int num1,int num2) {
        return num1 + num2;
    }

    static int add(int num1,int num2,int num3) {
        return num1 +num2 + num3;
    }
}
