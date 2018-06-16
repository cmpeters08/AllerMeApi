package com.cmpeters08.allermeApi.User;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue
    private int Id;

    private String name;

    private String email;


}
