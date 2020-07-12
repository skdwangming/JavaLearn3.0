package design.singleton;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 饿汉式
 * 1、类初始化时就创建对象
 * 2、没有实现懒加载
 * 3、线程安全
 */
public class Singleton implements Serializable {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.entrySet();
    }

}
