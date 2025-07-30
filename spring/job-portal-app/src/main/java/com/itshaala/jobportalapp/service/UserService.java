package com.itshaala.jobportalapp.service;

import com.itshaala.jobportalapp.dao.UserDao;
import com.itshaala.jobportalapp.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User getUserById(int id) {
        return userDao.findById(id).get();
    }

    public void deleteAllUsers() {
        userDao.deleteAll();
    }

    public void deleteUserById(int id) {
        userDao.deleteById(id);
    }

    public void createUser(User user) {
        userDao.save(user);
    }
}
