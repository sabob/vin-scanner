import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToolTO {
    @NotNull(message = "Tool type is required")
    private String type; // Currently, only "function" is supported

    @NotNull(message = "Function definition is required for a tool")
    private FunctionDefinitionTO function;
}
