package structural.decorator.beverage;

public class Milk extends CondimentDecorator {
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float cost() {
        return super.cost()+2000;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", "+ this.description;
    }
}
