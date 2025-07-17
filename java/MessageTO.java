import lombok.Data;

import java.util.List;

@Data
public class MessageTO {
    @NotNull
    private String role;

    @NotNull
    @Size(min = 1)
    private List<@NotNull ContentPart> content;
}
