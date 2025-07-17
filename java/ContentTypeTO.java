public enum ContentType {
    TEXT("text"),
    IMAGE_URL("image_url"),
    UNKNOWN("unknown");  // fallback

    private final String value;

    ContentTypeTO(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ContentType fromString(String s) {
        for (ContentType ct : values()) {
            if (ct.value.equalsIgnoreCase(s)) {
                return ct;
            }
        }
        return UNKNOWN;
    }
}
