import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FunctionDefinitionTO {
    private String description; // An optional description of the function
    @NotNull(message = "Function name is required")
    private String name; // The name of the function to be called
    private FunctionParametersTO parameters; // The parameters the function accepts
}
