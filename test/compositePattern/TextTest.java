package compositePattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextTest {

    @Test
    void shouldRefreshTheText() {
        Text text = new Text();
        String actual = text.refresh();
        String expected = "Text is refreshing ";
        assertEquals(expected, actual);

    }
}