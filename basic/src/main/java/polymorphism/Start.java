package polymorphism;

public class Start {
    public static void main(String[] args) {
        Animal animal = new Cat();

        System.out.println(animal.age);
        //向上转型，父类数据类型的引用指向子类对象时，不能使用子类特有的成员属性及成员方法
//        System.out.println(cat.name); //报错
//        cat.catchMouse();//报错
        animal.eat();
        animal.run();

        System.out.println();

        //想下转型后，就可以使用了
        Cat cat = (Cat) animal;
        System.out.println(cat.age);
        System.out.println(cat.name);
        cat.catchMouse();
        cat.eat();
        cat.run();
    }
}
