/**
 * 
 */
package com.adecars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
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

	/**
	 * This Method is used for high jacking requests so as to check it against the
	 * set security measures.
	 * <p>
	 * The singular antMatchers() contain the String URLs for the home page and the
	 * static resources which do not require any authentication.
	 * </p>
	 * <p>
	 * <strong>Note: </strong>The method parameter should be used only once.
	 * Therefore, if there is need to specify multiple URLs, the URL patterns should
	 * be added to the only antMatchers() but they should be separated with comma(,)
	 * delimited. The comma delimited URLs will be resolved separately.
	 * </p>
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("Code execution is reaching confugure()");
		http.authorizeRequests().antMatchers("/", "/home", "/css/**", "/js/**", "/fonts/**", "/images/**").permitAll()
				.anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout()
				.permitAll();
		// This line allows access to static resources
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {

		System.out.println("Code execution is reaching userDetailsService()");
		UserDetails userDetails = User.withDefaultPasswordEncoder().username("Stevens").password("trying").roles("USER")
				.build();
		InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(userDetails);
		return inMemoryUserDetailsManager;
	}

}
