package com.zwx.xm.entity;

public class Comment {
	/**  **/
	private Integer id;
	/** ����Id **/
	private Integer articleId;
	/** �û�Id **/
	private Integer userId;
	/** �������� **/
	private String content;
	/** ����ʱ�� **/
	private String created;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
}
