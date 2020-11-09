package com.disenotuweb.rolesSecurity.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.disenotuweb.rolesSecurity.entity.Users;
import com.disenotuweb.rolesSecurity.entity.Authority;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>  {
    public Optional<Users> findByUsername(String username);
}
