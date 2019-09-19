package com.slimani.medicospot.dao;


import com.slimani.medicospot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findUserByUsername(String username);
}
