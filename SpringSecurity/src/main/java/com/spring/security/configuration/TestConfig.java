package com.spring.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class TestConfig {
	
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails adminUser=User.withUsername("piyush")
				.password("piyush")
				.roles("ADMIN")
				.build();

		UserDetails normalUser=User.withUsername("udit")
				.password("udit")
				.roles("NORMAL")
				.build();
		
		InMemoryUserDetailsManager im=new InMemoryUserDetailsManager(adminUser,normalUser);
		return im;
	}
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests()
		.requestMatchers("/home/admin").hasRole("ADMIN")
		.requestMatchers("/home/normal").hasRole("NORMAL")
		.requestMatchers("/home/public")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin();
		
		return httpSecurity.build();
	}
}
