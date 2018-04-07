/**
 * 
 */
package com.adecars.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Since 21:23:32 | 10 Sep 2017
 *
 * @author uniqueM
 */

public class AdeCarsWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * @return This method is responsible for
	 */

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub

		System.out.println("code execution is reaching getRootConfigClasses()");
		Class<?>[] RootConfigClasses = new Class[] { SpringRootConfig.class, SpringSecurityConfig.class };
		return RootConfigClasses;
		// return new Class[] { SpringRootConfig.class, SpringSecurityConfig.class };
	}

	/*
	 * @return This method is responsible for
	 */

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub

		System.out.println("code execution is reaching getServletConfigClasses()");
		Class<?>[] webConfigClasses = new Class[] { SpringWebConfig.class };
		// return new Class[] { SpringWebConfig.class };
		return webConfigClasses;
	}

	/*
	 * @return This method is responsible for
	 */

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub

		System.out.println("code execution is reaching getServletMappings()");
		return new String[] { "/" };
	}

	/*
	 * @return This method is responsible for
	 */

	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub

		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		return new Filter[] { encodingFilter };
	}

}
