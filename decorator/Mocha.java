package decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with mocha";
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.2;
    }
}
