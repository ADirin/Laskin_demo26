import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LaskinTest {
    Laskin laskin = new Laskin();

    @Test
    void addMe() {
        assertEquals(14,laskin.addMe(12,2));

    }

    @Test
    void subtractMe() {
        assertEquals(10,laskin.subtractMe(12,2));
    }

    @Test
    void multiplyMe() {
        assertEquals(24,laskin.multiplyMe(12,2));
    }

    @Test
    void divideMe() {
        assertEquals(6,laskin.divideMe(12,2));
    }
}