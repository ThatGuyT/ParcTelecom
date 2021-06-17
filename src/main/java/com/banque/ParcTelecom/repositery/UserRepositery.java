package com.banque.ParcTelecom.repositery;

import com.banque.ParcTelecom.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositery extends CrudRepository<User, String> {
}
