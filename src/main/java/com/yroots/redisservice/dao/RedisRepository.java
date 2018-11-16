package com.yroots.redisservice.dao;

import com.yroots.redisservice.models.BaseCache;

public interface RedisRepository {

	boolean save(BaseCache baseCache);
	Object get(Object key);	
}
