package singleton;

public class Singleton {
    public static Singleton getInstance(){
        return new Singleton();
    }
}
