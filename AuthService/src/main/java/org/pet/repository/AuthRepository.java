package org.pet.repository;

import org.pet.repository.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepository extends JpaRepository<Auth,Long> {
    Optional<Auth> findOptionalByUserNameAndPassword(String userName,String password);

    Optional<Auth> findOptionalByUserName(String userName);
}
