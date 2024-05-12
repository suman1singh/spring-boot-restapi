package com.restapi.springcrud.service;

import com.restapi.springcrud.dto.UserDTO;
import com.restapi.springcrud.entity.User;
import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);

    void updateName(Integer id, UserDTO userDTO);
}
