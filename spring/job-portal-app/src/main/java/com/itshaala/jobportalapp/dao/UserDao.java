package com.itshaala.jobportalapp.dao;

import com.itshaala.jobportalapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Integer> {

}
