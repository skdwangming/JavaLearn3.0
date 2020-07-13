package design.singleton;

public class SingletonStaticInnerClass {
    private SingletonStaticInnerClass() {
    }

    private static class Inner {
        private static final SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
    }

    public SingletonStaticInnerClass getInstance() {
        return Inner.instance;
    }
}
