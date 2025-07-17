import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import java.util.Map;

/**
 * Single content part in a structured content array for multimodal messages.
 * <p>
 * Supports known fields for common types, and a generic map for forward compatibility.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContentPartTO {

    /**
     * The content type, e.g. "text", "image_url", etc.
     */
    @NotNull(message = "Content part type is required")
    private String type;

    /**
     * Present if type == "text"
     */
    private String text;

    /**
     * Present if type == "image_url"
     */
    private ImageUrlTO image_url;

    // Optional: For any additional or future fields not explicitly modeled by OpenAI or your API
    private Map<String, Object> extensions;


    /**
     * Helper method to get the content type as an enum.
     */
    public ContentTypeTO getContentType() {
        return ContentTypeTO.fromString(type);
    }
}
