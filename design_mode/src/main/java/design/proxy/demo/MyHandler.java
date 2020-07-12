package design.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyHandler implements InvocationHandler {
    private Object object;

    public MyHandler(Object object) {
        this.object = object;
    }

    /**
     * @param proxy  调用方法的代理实例,被代理的对象
     * @param method 调用的方法
     * @param args   调用方法传的参数
     * @return
     * @throws
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("< object:" + object + " > < method:" + method.getName() + " > < args:" + Arrays.toString(args) + " >");
        return method.invoke(object, args);
    }
}
