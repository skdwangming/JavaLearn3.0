package design.proxy.demo;

public class BigCar implements Car {

    @Override
    public String drive() {
        System.out.println("BigCar");
        return "BigCar";
    }
}
