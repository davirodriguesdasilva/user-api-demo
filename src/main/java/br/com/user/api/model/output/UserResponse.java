package br.com.user.api.model.output;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "Schema user response")
@Setter
@Getter
public class UserResponse {
    @Schema(description = "User ID", example = "123")
    private Long id;

    @Schema(description = "User name", example = "Fulano de Tal")
    private String name;

    @Schema(description = "User email", example = "fulanodetal@gmail.com")
    private String email;
}
