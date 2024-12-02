import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringHasher {
    /**
     * Hashes a string using SHA-256.
     *
     * @param input The input string.
     * @return The hashed string in hexadecimal format.
     */
    public static String hashString(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Hashing algorithm not found", e);
        }
    }
}