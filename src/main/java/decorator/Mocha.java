package decorator;

import static decorator.Constants.MOCHA_PRICE;

public class Mocha extends Beverage{
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + MOCHA_PRICE;
    }
}