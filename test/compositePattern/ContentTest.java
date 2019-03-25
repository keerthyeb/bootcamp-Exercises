package compositePattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContentTest {
    @Test
    void shouldRefreshTheContentWithOutChildern() {
        Content content = new Content();
        String actual = content.refresh();
        String expected = "Content is refreshing ";
        assertEquals(expected,actual);

    }

    @Test
    void shouldRefreshTheContentWithChildern() {
        Content content = new Content();
        content.add(new Image());
        content.add(new Text());
        String actual = content.refresh();
        String expected = "Content is refreshing Image is refreshing Text is refreshing ";
        assertEquals(expected,actual);

    }

}