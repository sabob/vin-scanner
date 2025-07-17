import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseFormatTO {
    @NotNull(message = "Response format type is required")
    private String type; // Must be "text" or "json_object"
}
