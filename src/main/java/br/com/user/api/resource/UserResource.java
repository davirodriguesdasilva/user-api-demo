package br.com.user.api.resource;

import br.com.user.api.model.output.UserResponse;
import br.com.user.domain.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Validated
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @Operation(summary = "Get user", description = "Get user by ID")
    public ResponseEntity<UserResponse> findById(
            @PathVariable
            @Pattern(regexp = "^[1-9]\\d*$", message = "ID must contain only digits greater than zero.") String id) {

        return ResponseEntity.ok(userService.findById(Long.valueOf(id)));
    }
}
