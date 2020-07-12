package design.singleton;

/**
 * @Classname Singleton3
 * @Description 懒汉式
 * @Date 2020/6/29 00:25
 * @Author wm
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
