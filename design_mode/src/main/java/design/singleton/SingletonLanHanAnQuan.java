package design.singleton;

public class SingletonLanHanAnQuan {
    private SingletonLanHanAnQuan(){}
    private static SingletonLanHanAnQuan instance;
    public synchronized SingletonLanHanAnQuan getInstance(){
        if(instance == null){
            instance = new SingletonLanHanAnQuan();
        }
        return instance;
    }
}
