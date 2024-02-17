package com.example.gnet.service;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.gnet.domain.Users;
import com.example.gnet.repository.AuthorityRepository;
import com.example.gnet.repository.ImagesRepository;
import com.example.gnet.repository.UsersRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepo;
    private final ImagesRepository imageRepo;
    private final AuthorityRepository authorityRepo;

    public List<Users> selectA() {
        return usersRepo.findAll();
    }

    public Users selectId(String id){
        return usersRepo.findById(id).orElse(new Users());
    }

    public void save(Users user){
        user.setCreationtime(new Date());
        user.setLastlogintime(new Date());
        user.setIconid(imageRepo.save(user.getIconid()));
        user.setAuthoritygroup(authorityRepo.save(user.getAuthoritygroup()));;
        usersRepo.save(user);
    }
}
