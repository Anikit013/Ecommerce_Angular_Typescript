package com.pelatro.pelatrocartapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.pelatro.pelatrocartapp.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

	Users findByEmail(String email);
//Optional<Users> findByEmail(@Param("email") String email);
//
//	Optional<Users> findByPassword(@Param ("password") String password);
//

}
