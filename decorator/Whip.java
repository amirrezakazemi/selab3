package decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with whip";
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.10;
    }
}