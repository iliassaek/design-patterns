package singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static synchronized Singleton getInstance(){
        if(Objects.isNull(instance)){
            instance = new Singleton();
        }
        return instance;
    }
}
