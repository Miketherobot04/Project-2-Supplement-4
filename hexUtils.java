import java.util.Random;

public class HexUtils {
    /**
     * Generates a 32-character hexadecimal string formatted as:
     * xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
     *
     * @return A formatted random hexadecimal string.
     */
    public static String generateRandomHex() {
        Random random = new Random();
        StringBuilder hexBuilder = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            hexBuilder.append(Integer.toHexString(random.nextInt(16)));
        }

        // Insert dashes at appropriate positions
        return hexBuilder.insert(8, '-').insert(13, '-').insert(18, '-').insert(23, '-').toString();
    }
}