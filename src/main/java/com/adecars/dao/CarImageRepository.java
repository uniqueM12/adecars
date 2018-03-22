package com.adecars.dao;

import java.io.InputStream;

import com.mongodb.DBObject;

public interface CarImageRepository {

	public void save(InputStream image, String fileName, String fileType, DBObject metaData);
}