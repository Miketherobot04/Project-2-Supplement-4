public class StringArrayManager {
    private final String[] array;

    /**
     * Constructs a StringArrayManager with a specified size.
     *
     * @param size The size of the internal string array.
     */
    public StringArrayManager(int size) {
        array = new String[size];
    }

    /**
     * Inserts a string into the array using a modulus index to handle overflow.
     *
     * @param value The string to insert.
     * @param index The specified index.
     */
    public void insert(String value, int index) {
        int modIndex = index % array.length;
        array[modIndex] = value;
    }

    /**
     * Retrieves the string at the specified index.
     *
     * @param index The index to retrieve.
     * @return The string at the index or null if not set.
     */
    public String get(int index) {
        return array[index % array.length];
    }
}