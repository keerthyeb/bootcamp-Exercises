package compositePattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BottomPanelTest {

    @Test
    void shouldRefreshTheBottomPanel() {
        BottomPanel bottomPanel = new BottomPanel();
        String actual = bottomPanel.refresh();
        String expected = "BottomPanel is refreshing ";
        assertEquals(expected, actual);

    }
}