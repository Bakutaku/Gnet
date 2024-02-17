package com.example.gnet.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;


import com.example.gnet.domain.Images;
import com.example.gnet.domain.Users;
import com.example.gnet.repository.AuthorityRepository;
import com.example.gnet.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDetailsService implements UserDetailsManager{
    private final UsersRepository userRep;
    private final AuthorityRepository authorityRep;
    private final UsersService userData;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // DBからユーザ名に一致するデータを取得
        Optional<Users> account = userRep.findById(username);

        if(account.isPresent()){
            return User.withUsername(account.get().getUserid())
            .password(account.get().getPassword())
            .roles(account.get().getAuthoritygroup().getId())
            .build();
        }
        throw new UsernameNotFoundException("Not" + username);
    }

    @Override
    public void createUser(UserDetails user) {
        
        Users account = new Users();

        account.setUserid(user.getUsername());
        account.setPassword(user.getPassword());
        account.setAuthoritygroup(authorityRep.findById("user").get());
        account.setName("No Name");
        
        account.setEmail("test@sample.com");

        account.setIconid(new Images());
        account.getIconid().setPathid("img/water.jpg");

        userData.save(account);

        // throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public void updateUser(UserDetails user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        throw new UnsupportedOperationException("Unimplemented method 'changePassword'");
    }

    // ユーザがいるかどうか
    @Override
    public boolean userExists(String username) {
        return userRep.existsById(username);
    }
}
