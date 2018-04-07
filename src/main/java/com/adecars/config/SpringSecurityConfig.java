/**
 * 
 */
package com.adecars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Since 5 Apr 2018 | 14:34:03
 *
 * @author uniqueM
 */

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {

		System.out.println("Code execution is reaching ignoring confugure()");
		web.ignoring().antMatchers("/resources/**");
		// Spring Security should completely ignore URLs starting with /resources/
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("Code execution is reaching confugure()");
		http.antMatcher("/").authorizeRequests().anyRequest().hasRole("ADMIN").and().httpBasic();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {

		System.out.println("Code execution is reaching userDetailsService()");
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder().username("Stevens").password("trying").roles("USER")
				.build());
		return manager;
	}

}
