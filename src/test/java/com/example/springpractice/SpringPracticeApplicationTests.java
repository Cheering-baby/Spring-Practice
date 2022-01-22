package com.example.springpractice;

import com.example.springpractice.entity.User;
import com.example.springpractice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class SpringPracticeApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        Boolean is = userRepository.existsById(new Integer(2));
        assertTrue(is);
    }

}
