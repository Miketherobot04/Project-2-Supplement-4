import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringHasherTest {

    @Test
    public void testHashString() {
        String input = "HelloWorld";
        String hash = StringHasher.hashString(input);
        assertNotNull(hash);
        assertEquals(64, hash.length());
        assertTrue(hash.matches("[0-9a-f]+"));
    }
}