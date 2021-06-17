package com.banque.ParcTelecom.repositery;

import com.banque.ParcTelecom.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    public Role findRoleByRole(String role);
}
