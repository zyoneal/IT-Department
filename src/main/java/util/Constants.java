package util;

public class Constants {

    /**
     * Validation keys
     */
    public static final String MAX = "max";

    public static final String PATTERN = "pattern";

    public static final String EXISTS = "exists";

    public static final String REQUIRED = "required";

    /**
     * Regular Expressions
     */
    public static final String NAME_VALIDATION = "[a-zA-Z-'\\. ]*";

    public static final String EMAIL_VALIDATION = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    public static final String API_ENDPOINT = "/api/v1";

    private Constants() {
        throw new UnsupportedOperationException();
    }

}
