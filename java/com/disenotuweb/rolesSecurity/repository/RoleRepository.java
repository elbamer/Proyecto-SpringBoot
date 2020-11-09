package com.disenotuweb.rolesSecurity.repository;


import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import com.disenotuweb.rolesSecurity.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

    public Role findByName(String role);
}
