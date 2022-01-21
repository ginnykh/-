package org.khj.domain;

public class memberDTO {

	// id
	private String id;
	// password
	private String password;
	// name
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "memberDTO [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

}
