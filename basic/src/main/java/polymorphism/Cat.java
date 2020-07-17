package polymorphism;

public class Cat extends Animal {
    String name = "cat";

    @Override
    public void run() {
        System.out.println("cat run");
    }

    public static void eat(){
        System.out.println("cat eat");
    }

    public void catchMouse() {
        System.out.println("catch mouse");
    }
}
