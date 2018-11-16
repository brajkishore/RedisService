package com.yroots.redisservice.models;

import java.io.Serializable;

public abstract class BaseCache implements Serializable {
	public Long expiryInMillis;	
	
	
	public Object key;
	
	public abstract Long getExpiryInMillis();
	public abstract Object getKey();
}
