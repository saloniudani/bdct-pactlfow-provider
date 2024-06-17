package com.example.bdct.controller;


import com.example.bdct.service.UserService;
import com.exmaple.bdct.api.UsersApi;
import com.exmaple.bdct.model.UserList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController  implements UsersApi {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<UserList> getUsers(Integer page, Integer pageSize) {
        UserList users = userService.getUsers(page,pageSize);
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
}
