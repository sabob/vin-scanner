import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageTO {
    @NotNull(message = "Role is required for a message")
    private String role; // e.g., "system", "user", "assistant", "tool"

    @NotNull(message = "Content is required for a message")
    @Size(min = 1, message = "At least one content part is required")
    private List<@NotNull ContentPartTO> content;

    // Optional: For messages from the 'tool' role, the ID of the tool call this message is responding to.
    private String tool_call_id;

    // If you need to support tool calls in assistant messages, you'd define ToolCall and include:
    // private List<ToolCall> tool_calls;
}
