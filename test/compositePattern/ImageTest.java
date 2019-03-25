package compositePattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageTest {
    @Test
    void shouldRefreshTheImage() {
        Image image = new Image();
        String actual = image.refresh();
        String expected = "Image is refreshing ";
        assertEquals(expected,actual);

    }

}