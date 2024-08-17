package com.example.demo.service;

import com.example.demo.dto.OrderDto;
import com.example.demo.dto.UsersDto;
import com.example.demo.dto.request.UserRequest;
import com.example.demo.model.Users;

public interface UserService {
    void save(UserRequest request);
    UsersDto findById(Long id);
    void deleteById(Long id);


}
