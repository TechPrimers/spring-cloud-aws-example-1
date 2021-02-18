package com.techprimers.service;

import com.techprimers.model.User;
import com.techprimers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RedisService {

  @Autowired
  UserRepository userRepository;

  public User getById(Integer id) {
    return userRepository.findById(id);
  }

  public Map<Integer, User> findAll() {
    return userRepository.findAll();
  }

  public void save(User user) {
    userRepository.save(user);
  }
}
