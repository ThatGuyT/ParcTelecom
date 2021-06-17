package com.banque.ParcTelecom.services;

import com.banque.ParcTelecom.models.User;
import com.banque.ParcTelecom.repositery.RoleRepository;
import com.banque.ParcTelecom.repositery.UserRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepositery userRepositery;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public User findUserByUsername(String username) {
        Optional<User> optionalUser= userRepositery.findById(username);
        if(optionalUser.isPresent())return optionalUser.get();
        return null;
    }
    public void register(String userName, String email, String password) {
        User user = new User( userName, passwordEncoder.encode(password), email,true, roleRepository.findRoleByRole("agences"));
        System.out.println(user);
        userRepositery.save(user);
    }
}
