package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

private Book a, b, c;

    @BeforeEach
    void setUp() {
        a = new Book("Hob", 500);
        b = new Book("Popi", 250);
        c = new Book("Touge", 100);
    }

    @Test
    void checkout() {
    }
}