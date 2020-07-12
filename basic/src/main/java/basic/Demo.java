package basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @Classname Demo
 * @Description TODO
 * @Date 2020/7/6 22:30
 * @Author wm
 */
public class Demo {

    /**
     * 由高位到低位
     *
     * @param i
     * @return
     */
    public byte[] int2Byte(int i) {
        byte[] bytes = new byte[4];
        bytes[0] = (byte) ((i >> 24));
        bytes[1] = (byte) ((i >> 16));
        bytes[2] = (byte) ((i >> 8));
        bytes[3] = (byte) (i);
        return bytes;
    }

    public byte[] int2Byte2(int i) {
        byte[] bytes = new byte[4];
        bytes[0] = (byte) ((i >> 24) & 0xff);
        bytes[1] = (byte) ((i >> 16) & 0xff);
        bytes[2] = (byte) ((i >> 8) & 0xff);
        bytes[3] = (byte) (i & 0xff);
        return bytes;
    }

    public String Byte2String(byte nByte) {
        StringBuilder nStr = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            int j = (int) nByte & (int) (Math.pow(2, (double) i));
            if (j > 0) {
                nStr.append("1");
            } else {
                nStr.append("0");
            }
        }
        return nStr.toString();
    }

    @Test
    public void test1() {
        byte[] bytes = int2Byte2(-256);
        for (byte b : bytes) {
            String s = Byte2String(b);
            System.out.println(s);
        }
    }

    @Test
    public void test2() {
        String s = Byte2String((byte) -127);
        System.out.println(s);
    }
}
