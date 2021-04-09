package bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public abstract class PowTest {
    Pow pow;
    @Test
    void tests() {
            assertEquals(25, pow.pow(5, 2));
            assertEquals(1024, pow.pow(2, 10));
            assertEquals(4, pow.pow(-2, 2));
            assertEquals(-8, pow.pow(-2, 3));
            assertEquals(0.25, pow.pow(2, -2));
            assertEquals(-0.125, pow.pow(-2, -3));
            assertEquals(1, pow.pow(10, 0));
            assertEquals(0.1, pow.pow(10, -1));
    }
}
class RecursiveSimplePowTest extends PowTest {

        @BeforeEach
        void init() {
            pow = new RecursivePow(new SimpleMultiplier());
        }
}

class RecursiveLoopPowTest extends PowTest {

        @BeforeEach
        void init() {
            pow = new RecursivePow(new LoopMultiplier());
        }
}

class LoopLoopPowTest extends PowTest {

        @BeforeEach
        void init() {
            pow = new LoopPow(new LoopMultiplier());
        }
}

class LoopSimplePowTest extends PowTest {

        @BeforeEach
        void init() {
            pow = new LoopPow(new SimpleMultiplier());
        }
}

