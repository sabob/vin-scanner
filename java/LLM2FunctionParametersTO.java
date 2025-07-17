import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LLM2FunctionParametersTO {
    @NotNull(message = "Function parameters type is required (e.g., 'object')")
    private String type; // Typically "object" for JSON Schema

    private Map<String, Object> properties; // Defines the properties (arguments) of the function, using JSON Schema format

    private List<String> required; // A list of required parameter names
}
