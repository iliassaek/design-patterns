package singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton instance;
    public static Singleton getInstance(){
        if(Objects.isNull(instance)){
            instance = new Singleton();
        }
        return instance;
    }
}
