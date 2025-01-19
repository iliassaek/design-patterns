package strategy;

public class RedHeadDuck implements Duck{
    public static final String QUACK_QUACK = "Red head duck: Quack quack";
    public static final String FLY_FLY = "Red head duck is flying .....";

    @Override
    public String quack() {
        return QUACK_QUACK;
    }

    @Override
    public String fly() {
        return FLY_FLY;
    }
}
