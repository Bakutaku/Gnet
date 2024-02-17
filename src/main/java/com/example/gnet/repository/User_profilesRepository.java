package com.example.gnet.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.User_profiles;


public interface User_profilesRepository extends JpaRepository<User_profiles, String> {

    // List<User_profiles> findByUserid(Users userid);

}
