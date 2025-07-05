package br.com.user.domain.service;

import br.com.user.api.model.output.UserResponse;

public interface UserService {
    UserResponse findById(Long id);
}
