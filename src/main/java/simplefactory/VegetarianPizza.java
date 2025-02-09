package simplefactory;

public class VegetarianPizza implements Pizza{
    @Override
    public String getDescription() {
        return "vegetarian";
    }
}
