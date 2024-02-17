package com.example.gnet.configs;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.example.gnet.repository.AuthorityRepository;
import com.example.gnet.repository.UsersRepository;
import com.example.gnet.service.UserDetailsService;
import com.example.gnet.service.UsersService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private final UsersRepository userRep;
    private final UsersService userData;
    private final AuthorityRepository authorityRep;

    @Bean
    protected PasswordEncoder passwordEncoder(){
        // パスワードの暗号化
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{

        http.formLogin(login -> login
            .loginPage("/login")
            .usernameParameter("username")
            .passwordParameter("password")
            .defaultSuccessUrl("/gnet/home",true)
            .permitAll()
        ).authorizeHttpRequests(authz -> authz
            .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
            .requestMatchers("/test/setup").permitAll()
            .requestMatchers("/login", "/signup", "/error", "/error").permitAll()
            .requestMatchers("/gent/js/*").permitAll()
            .requestMatchers("/gnet/css/*").permitAll()
            .anyRequest().authenticated()
        );
        


        return http.build();
    }

    @Bean
    public UserDetailsManager userDetailsManager(){
        UserDetailsManager manager = new UserDetailsService(this.userRep, authorityRep, userData);

        // manager.createUser(User.withUsername("user").password(passwordEncoder().encode("12345")).build());

        return manager;
    }

}
