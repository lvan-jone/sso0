package com.sohnny.auth.entity;


import lombok.Data;

import javax.persistence.*;

/**
 * created by feng on 2024/12/4
 */
@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String roles;



}
