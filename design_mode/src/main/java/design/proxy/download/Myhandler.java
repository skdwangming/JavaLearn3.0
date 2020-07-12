package design.proxy.download;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Myhandler implements InvocationHandler {

    private Object object;

    public Myhandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("proxy: %s", proxy.getClass());
        System.out.println();
        System.out.printf("object: %s", object);
        System.out.println();
        System.out.printf("method: %s", method.getName());
        System.out.println();
        System.out.printf("args: %s", Arrays.toString(args));
        System.out.println();
        return method.invoke(object, args);
    }
}
