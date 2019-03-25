package compositePattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SidePanelTest {
    @Test
    void shouldRefreshTheSidePanel() {
        SidePanel sidePanel = new SidePanel();
        String actual = sidePanel.refresh();
        String expected = "SidePanel is refreshing ";
        assertEquals(expected, actual);

    }

}