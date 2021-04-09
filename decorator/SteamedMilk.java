package decorator;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.1;
    }
}
