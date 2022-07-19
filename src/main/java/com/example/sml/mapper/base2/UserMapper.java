package com.example.sml.mapper.base2;

import com.example.sml.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    int totalCount();
   List<User> allUsers();
}
