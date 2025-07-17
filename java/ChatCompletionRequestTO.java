import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatCompletionRequestTO {

    @NotNull(message = "Model is required")
    private String model;

    @NotNull
    @Size(min = 1, message = "At least one message is required")
    private List<@NotNull MessageTO> messages;

    private Double temperature;
    private Double top_p;
    private Integer n;
    private Boolean stream;

    private List<String> stop;

    private Integer max_tokens;
    private Double presence_penalty;
    private Double frequency_penalty;

    private Map<Integer, Integer> logit_bias;

    private String user;

    private ResponseFormatTO response_format;

    private Integer seed;

    private List<ToolTO> tools;

    private Object tool_choice; // Can be a String ("none", "auto") or an object

    private Boolean logprobs;

    private Integer top_logprobs;
}
