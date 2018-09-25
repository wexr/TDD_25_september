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
    void testNytPunktXEqualsFour() {
        //3. Arrange
        Punkt punkt = new Punkt();
        //2. Act
        punkt.setX(4.0);
        //1. Assert
        assertEquals(4.0,punkt.getX(), 0.001);
    }

    @Test
    void testNytPunktXEqualsThree() {
        //3. Arrange
        Punkt punkt = new Punkt();
        //2. Act
        punkt.setX(3.0);
        //1. Assert
        assertEquals(3.0, punkt.getX(), 0.001);
    }

    @Test
    void testNytPunktYEqualsFour() {
        //3. Arrange
        Punkt punkt = new Punkt();
        //2. Act
        punkt.setY(0.4);
        //1. Assert
        assertEquals(0.4, punkt.getY(), 0.001);
    }

    @Test
    void testLengthEqualsTwo() {
        //3. Arrange
        Linie linie = new Linie();
        //2. Act
        linie.setLength(2);
        //1. assert
        assertEquals(2, linie.getLength(), 0.001);
    }

    @Test
    void testLengthEqualsThree() {
        //3. Arrange
        Linie linie = new Linie();
        Punkt punkt = new Punkt();
        //2. Act
        punkt.setX(7.0);
        punkt.setY(4.0);
        //1. Assert
        assertEquals(3, linie.afstand(7.0, 4.0), 0.001);

    }

    @Test
    void testLengthEqualsFour() {
        //3. Arrange
        Linie linie = new Linie();
        //2. Act

        //1. Assert
        assertEquals(4, linie.afstand(8.0, 4.0), 0.001);
    }
}