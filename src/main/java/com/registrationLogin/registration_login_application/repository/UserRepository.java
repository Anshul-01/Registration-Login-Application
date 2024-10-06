package com.registrationLogin.registration_login_application.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.registrationLogin.registration_login_application.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
