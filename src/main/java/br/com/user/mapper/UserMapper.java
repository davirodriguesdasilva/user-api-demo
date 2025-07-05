package br.com.user.mapper;

import br.com.user.api.model.output.UserResponse;
import br.com.user.domain.model.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse toResponse(User user);
}
