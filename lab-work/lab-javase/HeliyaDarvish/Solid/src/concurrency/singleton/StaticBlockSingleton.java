package concurrency.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception exception){
            System.err.println(exception.getMessage());
        }
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
