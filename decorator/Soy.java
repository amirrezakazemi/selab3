package decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
       return getBeverage().getDescription() + " with soy";
    }

    @Override
    public double cost() {
        return 0.15;
    }
}
