package com.techprimers.service;

import com.techprimers.model.User;
import com.techprimers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class SqsReceiver {

  @Autowired
  RedisService redisService;

  @SqsListener("user-cache-details")
  public void userCacheListener(User user) {
    System.out.println("Received Message for user..." + user.getName());

    redisService.save(user);
    System.out.println("Save Message in Cache");
  }
}
