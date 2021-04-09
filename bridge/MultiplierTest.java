package bridge;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class MultiplierTest {
    Multiplier multiplier;

    @Test
    void tests() {
        assertEquals(81, multiplier.multiply(9, 9));
        assertEquals(-56, multiplier.multiply(7, -8));
        assertEquals(20, multiplier.multiply(-4, -5));
        assertEquals(-30, multiplier.multiply(-5, 6));
    }
}


class SimpleMultiplierTest extends MultiplierTest {

    @BeforeEach
    void init() {
        multiplier = new SimpleMultiplier();
    }
}


class LoopMultiplierTest extends MultiplierTest {

    @BeforeEach
    void init() {
        multiplier = new LoopMultiplier();
    }
}
