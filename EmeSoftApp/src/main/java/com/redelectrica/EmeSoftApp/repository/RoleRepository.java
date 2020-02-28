package com.redelectrica.EmeSoftApp.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redelectrica.EmeSoftApp.entity.Role;





@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
