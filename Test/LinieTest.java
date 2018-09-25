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
        linie.setLength(5);
        //1. Assert
        assertEquals(5, linie.getLength());
    }

    @Test
    void testLengthEqualsEight() {
        //4. Annihilate
        //3. Arrange
        Linie linie = new Linie();
        //2. Act.
        linie.setLength(8);
        //1. Assert
        assertEquals(8, linie.getLength());
    }

    @Test
    void testNytPunktEqualsFour() {
        //3. Arrange
        Punkt punkt = new Punkt();
        //2. Act
        punkt.getX();
        //1. Assert
        assertEquals(4.0,punkt.getX());
    }

    @Test
    void testNytPunktEqualsThree() {
        //3. Arrange
        Punkt punkt = new Punkt();
        //2. Act
        punkt.getX();
        //1. Assert
        assertEquals(3.0, punkt.getX());
    }
}