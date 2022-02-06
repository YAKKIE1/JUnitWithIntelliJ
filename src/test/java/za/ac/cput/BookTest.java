package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

private Book a, b, c;

    @BeforeEach
    void setUp() {
        a = new Book("Hob", 500);
        b = new Book("Popi", 250);
        c = new Book("Touge", 250);
    }

    @Test
    void testTotalItemAmountEquality() {
        int expected = 500 * 2;
        int result = a.totalItemAmount(2);
        assertEquals(expected, result);
    }

    @Test
    void testTotalItemAmountIdentity() {
        c = b;
        assertSame(b, c);
    }


}