package bridge;

public class LoopMultiplier implements Multiplier {

    @Override
    public double multiply(double a, double b) {
        short signA = 1, signB = 1;
        if (a < 0)
            signA = -1;
        if (b < 0)
            signB = -1;

        double res = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            res += Math.abs(a);
        }
        return signA * signB * res;
    }
}