package com.example.bdct.service;

import com.exmaple.bdct.model.User;
import com.exmaple.bdct.model.UserList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class UserService {
    public UserList getUsers(Integer page, Integer pageSize) {
        return UserList.builder().size(2).totalElements(10l).totalPages(5).numberOfElements(2).number(0)
                .results(Arrays.asList(User.builder().userId("jim.corbett@gmail.com").age(20).name("Jim Corbett").build(),
                        User.builder().userId("lisa.ray@gmail.com").age(45).name("Lisa Ray").build()))
                .build();
    }
}
