/**
 * 
 */
package com.adecars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.adecars.dao.CarRepository;
import com.adecars.models.Car;
import com.adecars.service.CarService;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * Since 22:08:10 | 10 Sep 2017
 *
 * @author uniqueM
 */

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackageClasses = { Car.class, CarService.class })
@EnableMongoRepositories(basePackageClasses = CarRepository.class)
public class SpringRootConfig extends AbstractMongoConfiguration {

	/*
	 * @return This method is responsible for
	 */

	@Override
	protected String getDatabaseName() {
		System.out.println("code execution is reaching getDatabaseName()");
		// TODO Auto-generated method stub

		return "adecars";
	}

	/*
	 * @return /* @throws Exception This method is responsible for
	 */

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("code execution is reaching mongo()");
		return new MongoClient("localhost", 27017);
	}

	@Bean
	public GridFsTemplate gridFsTemplate() throws Exception {
		System.out.println("code execution is reaching gridFsTemplate()");
		return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
		System.out.println("code execution is reaching PersistenceExceptionTranslationPostProcessor()");
		return new PersistenceExceptionTranslationPostProcessor();
	}
}
