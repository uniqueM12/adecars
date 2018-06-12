/**
 * 
 */
package com.adecars.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import com.adecars.controller.HomeController;

/**
 * Since 22:25:45 | 10 Sep 2017
 * </p>
 * This class is used for creating a configuration for spring MVC. It contains
 * the Beans used for resolving template names from controller methods,
 * registering filters, collecting web resources such as css files, images and
 * other static resources, the methods are named i such a way that you have an
 * idea of what functions they perform.
 * 
 * <strong>Note: </strong> The class extends WebMvcConfigurationSupport instead
 * of WebMvcConfigurerAdapter. This is because we added Spring Security to the
 * class path which necessitated adding the
 * annotation; @EnableWebSecuritySupport, this annotation constitutes conflicts
 * with @EnableWebMVC which would have been used. So in order to by pass the
 * effects of the conflict we removed @EnableWebMVC and instead
 * used @EnableWebSecuritySupport. But we still needed the options provided for
 * MVC. Forfeiting @EnableWebMVC and extending class WebMVCConfigurerAdapter
 * would mean forfeiting the Bead addResourceHandlers, but even if we
 * forfeit @EnableWebMVC but we extend WebMVCConfigurationSupport we will still
 * be able to use that bean.
 * 
 * @author uniqueM
 */

@Configuration
// The package containing the controller classes should always be included in
// the web configuration class.
@ComponentScan(basePackageClasses = { HomeController.class })
// I added property source, in case I later decide to use it.
@PropertySource(value = { "classpath:Application.properties" })
public class SpringWebConfig extends WebMvcConfigurationSupport {

	@Autowired
	private ApplicationContext applicationContext;

	/**
	 * This method is used to configure messageSource() which holds the String
	 * Literals for the Thymeleaf front-end. It is mostly used for
	 * internationalisation requirements.
	 */
	@Bean
	public ResourceBundleMessageSource messageSource() {

		System.out.println("\n" + "execution is reaching messageSource()");
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("Messages");
		return messageSource;
	}

	/**
	 * This method is used for configuring relationship of the web application with
	 * other web app components, web app components here will include CSS files, js
	 * files fonts and images. <strong>Note: </strong> This method may not work
	 * conveniently if the containing class does not have is not annotated
	 * with @EnableWebMvc and if the class extends WebMvcConfigurerAdapter instead
	 * of WebMvcConfigurationSupport.
	 */
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {

		System.out.println("execution is reaching addResourceHandlers()");
		super.addResourceHandlers(registry);
		registry.addResourceHandler("/images/**").addResourceLocations("/resources/images/").setCachePeriod(0);
		registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/").setCachePeriod(0);
		registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/").setCachePeriod(0);
		registry.addResourceHandler("/fonts/**").addResourceLocations("/resources/fonts/").setCachePeriod(0);
		// this is one year cache period 31556926
	}

	@Autowired
	private Environment environment;

	/**
	 * This method is used to configure property source so that should there arise
	 * any need to use an external property file, then it would be used. </br>
	 * <strong>Note: </strong>The class is annotate with PropertySource which also
	 * specify the name of the file.
	 */
	public Properties propertiesSource() {
		System.out.println("code execution is reaching propertiesSource()");
		Properties properties = new Properties();
		properties.put("name of property in property file", environment.getRequiredProperty(
				"name of property in property file"));
		return properties;
	}

	@Bean
	public CommonsMultipartResolver multipartResolver() throws IOException {

		System.out.println("execution is reaching multipartResolver()");
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		return resolver;
	}

	/**
	 * This bean helps to resolve the strings returned by
	 */
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
