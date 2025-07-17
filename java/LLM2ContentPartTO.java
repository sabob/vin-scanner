import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class LLM2ContentPartTO {

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
    @JsonProperty("image_url") // Maps camelCase to snake_case
    private LLM2ImageUrlTO imageUrl;

    // Optional: For any additional or future fields not explicitly modeled by OpenAI or your API
    private Map<String, Object> extensions;


    /**
     * Helper method to get the content type as an enum.
     */
    public LLM2ContentTypeTO getContentType() {
        return LLM2ContentTypeTO.fromString(type);
    }
}
