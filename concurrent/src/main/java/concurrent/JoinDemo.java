package concurrent;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class JoinDemo extends Thread {
    int i;
    Thread previousThread; //上一个线程

    public JoinDemo( int i) {
//        this.previousThread = previousThread;
        this.i = i;
    }

    @Override
    public void run() {
//        try {
//            //调用上一个线程的join方法，大家可以自己演示的时候可以把这行代码注释掉
//            previousThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("num:" + i);
    }



    public static void main(String[] args) throws InterruptedException, IOException {
        byte[] a = new byte[10];
        a[0]= -127;
        System.out.println(a[0]);
        byte c = (byte) (a[0]&0xff);
        System.out.println(c);


    }
}
