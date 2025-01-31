package decorator;

import static decorator.Constants.MILK_PRICE;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }

    @Override
    public Double cost() {
        return beverage.cost() +MILK_PRICE;
    }
}
