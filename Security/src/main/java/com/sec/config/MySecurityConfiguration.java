 package com.sec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfiguration{

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		UserDetails admin=User.withUsername("Piyush")
				              .password(encoder.encode("Piyush"))
				              .roles("admin")
							  .build();
		UserDetails user=User.withUsername("User")
							  .password(encoder.encode("User"))
				              .roles("User")
							  .build();
		
		return new InMemoryUserDetailsManager(admin,user);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http.csrf().disable()
				   .authorizeHttpRequests()
				   .requestMatchers("/users/").permitAll()
				   .and()
				   .authorizeHttpRequests()
				   .requestMatchers("/users/**").authenticated()
				   .and().formLogin()
				   .and().build();
				   
	}
	
}