package decorator;

public class Espresso extends Beverage {

    @Override
    public Double cost() {
        return Constants.ESPRESSO_PRICE;
    }
}
