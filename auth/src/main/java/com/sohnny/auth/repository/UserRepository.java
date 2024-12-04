package com.sohnny.auth.repository;

import com.sohnny.auth.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by feng on 2024/12/4
 */
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
