package com.registrationLogin.registration_login_application.service;

import com.registrationLogin.registration_login_application.model.User;
import com.registrationLogin.registration_login_application.web.dto.UserRgistrationDto;

public interface UserService {
    User save(UserRgistrationDto registrationDto);
}
