package design.singleton;
/**
 * 饿汉式
 * 1、类初始化时就创建对象
 * 2、没有实现懒加载
 * 3、线程安全
 */
public class SingletonEHan {

    private final static SingletonEHan instance = new SingletonEHan();

    private SingletonEHan(){}

    public static SingletonEHan getInstance(){
        return instance;
    }

}
