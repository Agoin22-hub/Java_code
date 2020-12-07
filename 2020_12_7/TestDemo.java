/**
 * 完成一个登陆程序
 * 编写代码实现，模拟用户登录情景，并且只能登录三次。
 * 只允许输入三次密码，如果密码正确则提示登录成
 * 如果三次均输入错误，则退出程序
 */

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        String accountNumber = "jiangjin";
        String passWord = "000309";
        for(int i = 0; i < 3; i++) {
            System.out.println("请输入账号");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            System.out.println("请输入密码");
            Scanner sc1 = new Scanner(System.in);
            String password = sc1.nextLine();
            if (number.equals(accountNumber) && password.equals(passWord)) { //账号和密码必须都对
                System.out.println("登录正确");
                break;
            } else {
                if (i < 2) {
                    System.out.println("登录错误,您还剩" + (2 - i) + "次机会");
                } else {
                    System.out.println("对不起，您的机会已用完");
                }
            }
        }
    }
}
