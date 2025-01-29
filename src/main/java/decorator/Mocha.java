package decorator;

import static decorator.Constants.MOCHA_PRICE;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + MOCHA_PRICE;
    }
}