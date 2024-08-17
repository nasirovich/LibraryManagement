package com.example.demo.service.impl;

import com.example.demo.dto.OrderDto;
import com.example.demo.dto.UsersDto;
import com.example.demo.dto.request.UserRequest;
import com.example.demo.model.Orders;
import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    private final UserRepository repository;


    @Override
    public void save(UserRequest request) {
        repository.save(Users.builder()
                .email(request.getEmail())
                .name(request.getName())
                .surname(request.getSurname())
                .username(request.getUsername())
                .password(request.getPassword())
                .build());
    }

    @Override
    public UsersDto findById(Long id) {
        Optional<Users> users = repository.findById(id);
        return UsersDto.builder()
                .email(users.get().getEmail())
                .name(users.get().getName())
                .surname(users.get().getSurname())
                .username(users.get().getUsername())
                .build();
}

    @Override
    public void deleteById(Long id) {

    }
}
