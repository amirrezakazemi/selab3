package bridge;

public abstract class Pow {
    private final Multiplier multiplier;

    public Pow(Multiplier multiplier) {
        this.multiplier = multiplier;
    }

    public Multiplier getMultiplier(){
        return multiplier;
    }

    public abstract double pow(int a, int b);
}
