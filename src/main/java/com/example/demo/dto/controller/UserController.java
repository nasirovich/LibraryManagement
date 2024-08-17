package com.example.demo.dto.controller;

import com.example.demo.dto.UsersDto;
import com.example.demo.dto.request.UserRequest;
import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;
    @PostMapping ("/save")
    public ResponseEntity<Void> save(@RequestBody UserRequest request) {
        service.save(request);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> get(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }



}
