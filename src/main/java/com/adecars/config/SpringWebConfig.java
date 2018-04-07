/**
 * 
 */
package com.adecars.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * Since 22:25:45 | 10 Sep 2017
 *
 * @author uniqueM
 */

@Configuration
public class SpringWebConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private ApplicationContext applicationContext;

	// @Override
	// public void setApplicationContext(ApplicationContext applicationContext)
	// throws BeansException {
	//
	// this.applicationContext = applicationContext;
	// }

	@Bean
	public ResourceBundleMessageSource messageSource() {

		System.out.println("\n" + "execution is reaching messageSource()");
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("Messages");
		return messageSource;
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {

		System.out.println("execution is reaching addResourceHandlers()");
		super.addResourceHandlers(registry);
		registry.addResourceHandler("/images/**").addResourceLocations("/resources/images/").setCachePeriod(1);
		registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/").setCachePeriod(1);
		registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/").setCachePeriod(1);
		registry.addResourceHandler("/fonts/**").addResourceLocations("/resources/fonts/").setCachePeriod(1);
		// this is one year cache period 31556926
	}

	@Bean
	public CommonsMultipartResolver multipartResolver() throws IOException {

		System.out.println("execution is reaching multipartResolver()");
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		return resolver;
	}

	@Bean
	public SpringResourceTemplateResolver templateResolver() {

		System.out.println("execution is reaching templateResolver()");
		SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
		resolver.setApplicationContext(applicationContext);
		resolver.setPrefix("/WEB-INF/views/templetes/");
		resolver.setSuffix(".html");
		resolver.setTemplateMode(TemplateMode.HTML);
		resolver.setCacheable(false);
		return resolver;
	}

	@Bean
	public SpringTemplateEngine templateEngine() {

		System.out.println("Execution is reaching templateEngine()");
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.setTemplateResolver(templateResolver());
		engine.setEnableSpringELCompiler(true);
		return engine;
	}

	@Bean
	public ThymeleafViewResolver viewResolver() {

		System.out.println("execution is reaching viewResolver()");
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setTemplateEngine(templateEngine());
		resolver.setCharacterEncoding("UTF-8");
		return resolver;
	}

}
