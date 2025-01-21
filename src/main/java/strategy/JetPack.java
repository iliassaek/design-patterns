package strategy;

public class JetPack implements FlyBehavior{

    @Override
    public String fly() {
        return Constants.FLY_WITH_JET_PACK;
    }
}
