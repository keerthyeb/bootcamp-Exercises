package meassurments;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void ShouldReturnTrueIfBotheQuantityAreEqual() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity inch = new Quantity(new BigDecimal(12), Unit.INCH);
        assertEquals(feet,inch);

    }

    @Test
    void ShouldReturnFalseIfBotheQuantityAreNotEqual() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity inch = new Quantity(new BigDecimal(1), Unit.INCH);
        assertNotEquals(feet,inch);
    }

    @Test
    void ShouldReturnTrueIfTwoInchAndFiveCentimetrAreEqual() {
        Quantity feet = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity inch = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertEquals(feet,inch);
    }
}