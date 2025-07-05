package br.com.user.domain.service.impl;

import br.com.user.api.model.output.UserResponse;
import br.com.user.domain.model.User;
import br.com.user.domain.repository.UserRepository;
import br.com.user.domain.service.UserService;
import br.com.user.exception.NotFoundException;
import br.com.user.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserResponse findById(Long id){

        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found with id: " + id));

        return userMapper.toResponse(user);
    }
}
