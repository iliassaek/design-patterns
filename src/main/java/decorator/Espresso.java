package decorator;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "This is Espresso";
    }

    @Override
    public Double cost() {
        return Constants.ESPRESSO_PRICE;
    }
}
