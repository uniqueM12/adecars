package com.adecars.dao;

import java.io.InputStream;

import org.springframework.stereotype.Repository;

import com.mongodb.DBObject;

@Repository
public interface CarImageRepository {

	public void save(InputStream image, String fileName, DBObject metaData);
}
