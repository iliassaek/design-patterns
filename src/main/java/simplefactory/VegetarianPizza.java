package simplefactory;

public class VegetarianPizza implements Pizza{
    @Override
    public String getType() {
        return "vegetarian";
    }
}
