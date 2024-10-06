package com.registrationLogin.registration_login_application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.thymeleaf.expression.Arrays;
import java.util.Arrays;

import com.registrationLogin.registration_login_application.model.Role;
import com.registrationLogin.registration_login_application.model.User;
import com.registrationLogin.registration_login_application.repository.UserRepository;
import com.registrationLogin.registration_login_application.web.dto.UserRgistrationDto;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
        

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }


    @Override
    public User save(UserRgistrationDto registrationDto) {
        // TODO Auto-generated method stub
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), 
            registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    } 

}
