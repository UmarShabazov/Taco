package com.github.umarshabazov.tacocloud.tacos.data;

import com.github.umarshabazov.tacocloud.tacos.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {

    User findByUsername(String username);

}
