package bridge;

public class LoopPow extends Pow{
    public LoopPow(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public double pow(int a, int b) {
        double res = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            res = getMultiplier().multiply(res, a);
        }
        return b > 0 ? res : 1.0 / res;
    }


}

