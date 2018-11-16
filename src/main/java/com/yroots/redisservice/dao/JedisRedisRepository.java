package com.yroots.redisservice.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.yroots.redisservice.models.BaseCache;

@Repository("redisRepository")
public class JedisRedisRepository implements RedisRepository {

	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Override
	public boolean save(BaseCache baseCache) {
		// TODO Auto-generated method stub
		if(baseCache.getExpiryInMillis()!=null && baseCache.getExpiryInMillis()>0) {
				
			return redisTemplate.opsForValue().setIfAbsent(baseCache.getKey(), baseCache, baseCache.getExpiryInMillis(),TimeUnit.MILLISECONDS);
					
		}
		return redisTemplate.opsForValue().setIfAbsent(baseCache.getKey(), baseCache);		
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return redisTemplate.opsForValue().get(key);
	}

}
