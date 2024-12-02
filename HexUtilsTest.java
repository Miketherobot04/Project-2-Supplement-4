import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexUtilsTest {

    @Test
    public void testGenerateRandomHex() {
        String hex = HexUtils.generateRandomHex();
        assertNotNull(hex);
        assertEquals(36, hex.length());
        assertTrue(hex.matches("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"));
    }
}