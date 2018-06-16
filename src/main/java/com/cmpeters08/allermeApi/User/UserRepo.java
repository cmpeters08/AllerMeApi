package com.cmpeters08.allermeApi.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository <UserEntity, Integer>{


}
