package com.project.cashbox.security;

import com.project.cashbox.model.User;
import com.project.cashbox.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * тест на наличие Админа
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserDetailsServiceImplTest {

    UserRepository userRepository;

    @Autowired
    public UserDetailsServiceImplTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    void loadUserByUsername() {
        User user = userRepository.findByUsername("admin").orElseThrow(() ->
                new UsernameNotFoundException("User not found"));
        Assertions.assertNotNull(SecurityUser.fromUser(user));
    }

}