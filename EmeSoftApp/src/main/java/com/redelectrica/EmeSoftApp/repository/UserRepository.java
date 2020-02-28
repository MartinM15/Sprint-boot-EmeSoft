package com.redelectrica.EmeSoftApp.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redelectrica.EmeSoftApp.entity.User;



@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	//public Set<User> findByFirtsName (String name);


	
}
