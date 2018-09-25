import jdk.nashorn.internal.parser.TokenType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinieTest {

    @Test
    void testLengthEqualsFive() {

        //4. Annihilate
        //3. Arrange
        Linie linie = new Linie();
        //2. Act
        linie.getLength();
        //1. Assert
        assertEquals(5, linie.getLength());
    }

    @Test
    void testLengthEqualsEight() {
        //4. Annihilate
        //3. Arrange
        Linie linie = new Linie();
        //2. Act.
        linie.getLength();
        //1. Assert
        assertEquals(8, linie.getLength());
    }
}