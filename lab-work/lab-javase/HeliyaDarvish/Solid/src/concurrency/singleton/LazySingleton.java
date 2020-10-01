package concurrency.singleton;

public class LazySingleton {

    private static /* volatile (optional) */ LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
