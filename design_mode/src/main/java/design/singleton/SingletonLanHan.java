package design.singleton;
/**
 * 懒汉式:
 *      1、懒加载
 *      2、不适用多线程
 *      3、不常用
 */
public class SingletonLanHan {
    private static SingletonLanHan instance;
    private SingletonLanHan(){}

    public static SingletonLanHan getInstance(){
        if (instance == null){
            instance = new SingletonLanHan();
        }
        return instance;
    }
}
