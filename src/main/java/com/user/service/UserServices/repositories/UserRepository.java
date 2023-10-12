package com.user.service.UserServices.repositories;

import com.user.service.UserServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>
{

   // if you want to implement any custom method or query
    //write

}
