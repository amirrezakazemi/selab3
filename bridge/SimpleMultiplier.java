package bridge;

public class SimpleMultiplier implements Multiplier {

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }
}