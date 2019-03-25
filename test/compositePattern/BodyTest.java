package compositePattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyTest {

    @Test
    void shouldRefreshTheBody() {
        Body body = new Body();
        body.add(new SidePanel());
        body.add(new SidePanel());
        body.add(new Content());
        String actual = body.refresh();
        String expected = "Body is refreshing SidePanel is refreshing SidePanel is refreshing Content is refreshing ";
        assertEquals(expected,actual);

    }

}