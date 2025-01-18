package strategy;

public class MallardDuck implements Duck{

    public static final String QUACK_QUACK = "MallardDuck --> quack quack";
    public static final String FLY_FLY = "MallardDuck --> fly fly";

    //public static String QUACKING =
    @Override
    public String quack() {
        return QUACK_QUACK;
    }

    @Override
    public String fly() {
        return FLY_FLY;
    }
}
