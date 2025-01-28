package decorator;

public class Espresso implements Beverage {

    @Override
    public Double cost() {
        return Constants.ESPRESSO_PRICE;
    }
}
