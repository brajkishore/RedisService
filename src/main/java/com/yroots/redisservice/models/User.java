package com.yroots.redisservice.models;

public class User extends BaseCache {
	private static final long serialVersionUID = 344747079018401631L;
	
	public User() {
		
	}
	public User(String id,String name) {
		this.name=name;
		this.id=id;
	}	
	
	private String id;
	private String name;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Long getExpiryInMillis() {
		// TODO Auto-generated method stub
		return this.expiryInMillis;
	}
	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		if(this.key==null)
			return this.id;
		else
			return this.key;
	}
	
}
