package chance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    @DisplayName("should throw exception when value is negative")
    void shouldThrowExceptionWhenProbabilityIsLessThanLowerBound() {
        try {
            new Probability(-1);
            fail("it should fail");
        } catch (ProbabilityException e) {
        }
    }

    @Test
    @DisplayName("should throw exception when value is greater than one")
    void shouldThrowExceptionIfValueIsGreaterThanUpperBound() {
        assertThrows(ProbabilityException.class, () -> new Probability(2));
    }

    @Test
    @DisplayName("should  not throw exception when value is valid")
    void shouldNotThrowExceptionIfValueIsValid() {
        assertDoesNotThrow(() -> new Probability(0.9));
    }

    @Test
    void shouldGiveTheProbabilityOfNotGetting() throws ProbabilityException {
        Probability probabilityOfGetting = new Probability(0.2);
        Probability probabilityOfNotGetting = probabilityOfGetting.notGetting();
        Probability expectedProbabilityOfNotGetting = new Probability(0.8);
        assertEquals(expectedProbabilityOfNotGetting, probabilityOfNotGetting);
    }


}