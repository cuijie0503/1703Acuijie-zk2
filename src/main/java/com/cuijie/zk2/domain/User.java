/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: User.java 
 * @Prject: cuijie.zk2
 * @Package: com.cuijie.zk2.domain 
 * @Description: TODO
 * @author: 崔杰 
 * @date: 2019年8月12日 上午8:39:49 
 * @version: V1.0   
 */
package com.cuijie.zk2.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: User 
 * @Description: TODO
 * @author:崔杰 
 * @date: 2019年8月12日 上午8:39:49  
 */
public class User implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @fieldName: id
	 * @fieldType: int
	 * @Description: 编号
	 */
	private int id;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: 名字
	 */
	private String name;
	/**
	 * @fieldName: sex
	 * @fieldType: String
	 * @Description: 性别
	 */
	private String sex;
	/**
	 * @fieldName: phone
	 * @fieldType: String
	 * @Description: 手机
	 */
	private String phone;
	/**
	 * @fieldName: email
	 * @fieldType: String
	 * @Description: 邮箱
	 */
	private String email;
	/**
	 * @fieldName: birthday
	 * @fieldType: String
	 * @Description: 生日
	 */
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", email=" + email
				+ ", birthday=" + birthday + "]";
	}
	public User(int id, String name, String sex, String phone, String email, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
	
	
}
