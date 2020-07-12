package design.proxy.demo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Test1 {
    public static void main(String[] args) {
        String name = "join";
        MyHandler myHandler = new MyHandler(name);
        /**
         * loader:null表示为默认的类加载器
         * Class[]:被代理的对象的实现的接口
         * myHandler：实现增强方法的类
         * @Retrun：生成的代理类（已经实现了刚才传入的接口）
         */
        Object o = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, myHandler);
        Comparable c2 = (Comparable) o;
        c2.compareTo("jane");
    }

    @Test
    public void test1() {
        BigCar bigCar = new BigCar();
        MyHandler myHandler = new MyHandler(bigCar);
        Car c = (Car) Proxy.newProxyInstance(BigCar.class.getClassLoader(), new Class[]{Car.class}, myHandler);
        c.drive();

    }


}
