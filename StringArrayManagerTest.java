import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringArrayManagerTest {

    @Test
    public void testInsertAndRetrieve() {
        StringArrayManager manager = new StringArrayManager(5);

        manager.insert("test1", 0);
        manager.insert("test2", 6); // Should overwrite index 1 (6 % 5 = 1)

        assertEquals("test1", manager.get(0));
        assertEquals("test2", manager.get(1));
        assertNull(manager.get(2));
    }
}