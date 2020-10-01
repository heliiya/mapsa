package concurrency.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static /*synchronized*/ ThreadSafeSingleton getInstance() {
        //if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){ // double Check
                    instance = new ThreadSafeSingleton();
                }
            }
        //}
        return instance;
    }
}
