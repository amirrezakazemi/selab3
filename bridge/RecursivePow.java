package bridge;

public class RecursivePow extends Pow {
    public RecursivePow(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public double pow(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        double res = getMultiplier().multiply(a, pow(a, Math.abs(b) - 1));
        return b > 0 ? res : 1 / res;
    }

}