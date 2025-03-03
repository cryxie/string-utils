package string_utils.cryxie;

/**
 * Utility class for performing common string manipulations.
 * <p>
 * This class provides methods for modifying and formatting strings.
 * </p>
 */
public class StringUtils {

    /**
     * Capitalizes the first character of the given string.
     * <p>
     * If the string is empty or null, an exception will be thrown.
     * </p>
     *
     * @param string The input string to be modified.
     * @return A new string with the first character capitalized.
     * @throws NullPointerException            if the input string is null.
     * @throws StringIndexOutOfBoundsException if the input string is empty.
     */
    public static String capitalizeFirstCaracter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
