package com.akhambir.service;

import com.akhambir.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User getByUsername(String username);

    User register(User user);
}
