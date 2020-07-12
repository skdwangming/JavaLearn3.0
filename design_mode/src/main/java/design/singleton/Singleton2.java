package design.singleton;

/**
 * 懒汉式:
 *      1、懒加载
 *      2、不适用多线程
 *      3、不常用
 */
public class Singleton2 {
    public static void main(String[] args) {
        Singleton instance1= Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        Singleton instance3 = Singleton.INSTANCE;
        Singleton instance4 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance2.equals(instance2));

    }
}
