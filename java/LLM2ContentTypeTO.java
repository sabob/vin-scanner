// Enums typically don't use @Data, @NoArgsConstructor, @AllArgsConstructor, @Builder
// as their instances are fixed and created internally.
public enum LLM2ContentTypeTO {
    TEXT("text"),
    IMAGE_URL("image_url"),
    UNKNOWN("unknown");  // fallback

    private final String value;

    LLM2ContentTypeTO(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static LLM2ContentTypeTO fromString(String s) {
        for (LLM2ContentTypeTO ct : values()) {
            if (ct.value.equalsIgnoreCase(s)) {
                return ct;
            }
        }
        return UNKNOWN;
    }
}
