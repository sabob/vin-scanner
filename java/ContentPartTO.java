import lombok.Data;

import java.util.Map;

/**
 * Single content part in a structured content array.
 * <p>
 * Supports known fields for common types, and a generic map for forward compatibility.
 */
@Data
public class ContentPartTO {

    /**
     * The content type, e.g. "text", "image_url", etc.
     */
    private String type;


    @NotNull
    private String type;

    /**
     * Present if type == "text"
     */
    private String text;

    /**
     * Present if type == "image_url"
     */
    private ImageUrl image_url;

    private Map<String, Object> extensions;


    public ContentType getContentType() {
        return ContentType.fromString(type);
    }
}
