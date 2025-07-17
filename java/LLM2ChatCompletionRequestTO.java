import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LLM2ChatCompletionRequestTO {

    @NotNull(message = "Model is required")
    private String model;

    @NotNull
    @Size(min = 1, message = "At least one message is required")
    private List<@NotNull LLM2MessageTO> messages;

    private Double temperature;
    @JsonProperty("top_p") // Maps camelCase to snake_case
    private Double topP;
    private Integer n;
    private Boolean stream;

    private List<String> stop;

    @JsonProperty("max_tokens") // Maps camelCase to snake_case
    private Integer maxTokens;
    @JsonProperty("presence_penalty") // Maps camelCase to snake_case
    private Double presencePenalty;
    @JsonProperty("frequency_penalty") // Maps camelCase to snake_case
    private Double frequencyPenalty;

    @JsonProperty("logit_bias") // Maps camelCase to snake_case
    private Map<Integer, Integer> logitBias;

    private String user;

    @JsonProperty("response_format") // Maps camelCase to snake_case
    private LLM2ResponseFormatTO responseFormat;

    private Integer seed;

    private List<LLM2ToolTO> tools;

    @JsonProperty("tool_choice") // Maps camelCase to snake_case
    private Object toolChoice; // Can be a String ("none", "auto") or an object

    private Boolean logprobs;

    @JsonProperty("top_logprobs") // Maps camelCase to snake_case
    private Integer topLogprobs;
}
