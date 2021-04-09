package decorator;

public abstract class CondimentDecorator implements Beverage{
    private final Beverage beverage;
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;

    }
    public Beverage getBeverage(){
        return beverage;
    }


    public abstract String getDescription();

}
