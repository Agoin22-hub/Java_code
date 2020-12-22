/**
 * 类与对象的练习
 */
class Person {
    public int age;//成员属性 实例变量
    public String name;
    public String sex;
    public void eat() {//成员方法
        System.out.println("吃饭!");
    }
    public void sleep() {
        System.out.println("睡觉!");
    }
}

public class Testdemo{
    public static void main1(String[] args) {
        Person person = new Person();//通过new实例化对象
        person.eat();//成员方法调用需要通过对象的引用调用
        person.sleep();
        //产生对象     实例化对象
        Person person2 = new Person();
        Person person3 = new Person();
    }

    public static void main(String[] args) {
        //产生对象 实例化对象
        Person person1 = new Person();//person为对象的引用
        System.out.println(person1.age);//默认值为0
        System.out.println(person1.name);//默认值为null
        //System.out.println(person.count);//会有警告!
        //正确访问方式：
        System.out.println(Person1.count);
        System.out.println(Person1.COUNT);
        Person1.staticTest();
        //总结：所有被static所修饰的方法或者属性，全部不依赖于对象。
        person1.eat();
        person1.sleep();
    }
}

class Person1 {
    public int age;//实例变量   存放在对象内
    public String name;//实例变量
    public String sex;//实例变量
    public static int count;//类变量也叫静态变量，编译时已经产生，属于类本身，且只有一份。存放在方法区
    public final int SIZE = 10;//被final修饰的叫常量，也属于对象。 被final修饰，后续不可更改
    public static final int  COUNT = 99;//静态的常量，属于类本身，只有一份 被final修饰，后续不可更改
    //实例成员函数
    public void eat() {
        int a = 10;//局部变量
        System.out.println("eat()!");
    }
    //实例成员函数
    public void sleep() {
        System.out.println("sleep()!");
    }
    //静态成员函数
    public static void staticTest(){
        //不能访问非静态成员
        //sex = "man"; error
        System.out.println("StaticTest()");
    }
}


