package com.zwx.xm.entity;

import java.sql.Date;

public class User {
	/**  **/
	private Integer id;
	/** ��¼���� **/
	private String username;
	/** �û�ͷ�� **/
	private String headimg;
	/** ��¼���� **/
	private String password;
	/** �ǳ� **/
	private String nickname;
	/** ���� **/
	private Date birthday;
	/** �Ա�1���У�2��Ů **/
	private Integer gender;
	/** 0:����,1:���� **/
	private Integer locked;
	/** ���� **/
	private Integer score;
	/** 0:��ͨ�û�,1:����Ա **/
	private String role;
	/** ���˲�����ַ **/
	private String url;
	/** ����ʱ�� **/
	private Date create_time;
	/** �޸�ʱ�� **/
	private Date update_time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHeadimg() {
		return headimg;
	}
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
}
