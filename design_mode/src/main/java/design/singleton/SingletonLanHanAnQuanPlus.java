package design.singleton;

public class SingletonLanHanAnQuanPlus {
    private SingletonLanHanAnQuanPlus() {
    }

    private SingletonLanHanAnQuanPlus instance;

    public SingletonLanHanAnQuanPlus getInstance() {
        if (instance == null) {
            synchronized (SingletonLanHanAnQuanPlus.class) {
                if (instance == null) {
                    instance = new SingletonLanHanAnQuanPlus();
                }
            }
        }
        return instance;
    }

}
