package strategy;

public class RedHeadDuck implements Duck{
    public static final String QUACK_QUACK = "Read head duck: Quack quack";

    @Override
    public String quack() {
        return QUACK_QUACK;
    }

    @Override
    public String fly() {
        return null;
    }
}
