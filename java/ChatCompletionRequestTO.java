import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class ChatCompletionRequestTO {
    @NotNull
    @Size(min = 1)
    private List<@NotNull Message> messages;

    private Double temperature;
    private Double top_p;
    private Integer n;
    private Boolean stream;
    private Object stop;
    private Integer max_tokens;
    private Double presence_penalty;
    private Double frequency_penalty;
    private Map<String, Integer> logit_bias;
    private String user;
}
