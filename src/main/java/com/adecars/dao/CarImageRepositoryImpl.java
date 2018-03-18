/**
 * 
 */
package com.adecars.dao;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

import com.mongodb.DBObject;

/**
 * Since 7 Feb 2018 | 11:37:07
 *
 * @author uniqueM
 */
public class CarImageRepositoryImpl implements CarImageRepository {

	@Autowired
	GridFsTemplate gridFsTemplate;

	@Override
	public void save(InputStream image, String fileName, DBObject metaData) {
		// TODO Auto-generated method stub
		gridFsTemplate.store(image, fileName, metaData);
	}

}
