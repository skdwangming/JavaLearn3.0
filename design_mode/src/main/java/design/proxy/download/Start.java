package design.proxy.download;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Start {
    @Test
    public void test() {
        //被代理对象
        FileDownloadImpl fileDownload = new FileDownloadImpl();

        Myhandler myhandler = new Myhandler(fileDownload);
        /**
         * 返回的proxy是一个代理对象，这个对象是在程序运行过程中被创建的，继承了Proxy类，实现了FileDownloadInterface。
         * 在父类Proxy中存储着上边的myhandler，myhandler里边又存储着上边的fileDownload。
         *
         * 但是它又不能直接类型转换为FileDownloadImpl，所以它不是FileDownloadImpl类型的
         * 就是说它就是com.sun.proxy类型的
         *
         */
        FileDownloadInterface proxy =  (FileDownloadInterface)Proxy.newProxyInstance(fileDownload.getClass().getClassLoader(), new Class[]{FileDownloadInterface.class}, myhandler);
        /**
         * 因为代理类实现了接口的方法，并重写，重写后的方法是，直接调用myhandler的invoke方法。
         */
        boolean result = proxy.pictureDownload("picture");

    }
}
