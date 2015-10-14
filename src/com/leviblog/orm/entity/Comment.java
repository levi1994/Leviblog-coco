package com.leviblog.orm.entity;

public class Comment {
	
	private String com_id;
	private String com_article_id;
	private String com_parent;
	private String com_content;
	private String com_name;
	private String com_toname;
	private int com_depth;
	private String com_datetime;
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}
	public String getCom_article_id() {
		return com_article_id;
	}
	public void setCom_article_id(String com_article_id) {
		this.com_article_id = com_article_id;
	}
	public String getCom_parent() {
		return com_parent;
	}
	public void setCom_parent(String com_parent) {
		this.com_parent = com_parent;
	}
	public String getCom_content() {
		return com_content;
	}
	public void setCom_content(String com_content) {
		this.com_content = com_content;
	}
	public String getCom_name() {
		return com_name;
	}
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	public String getCom_toname() {
		return com_toname;
	}
	public void setCom_toname(String com_toname) {
		this.com_toname = com_toname;
	}
	public int getCom_depth() {
		return com_depth;
	}
	public void setCom_depth(int com_depth) {
		this.com_depth = com_depth;
	}
	public String getCom_datetime() {
		return com_datetime;
	}
	public void setCom_datetime(String com_datetime) {
		this.com_datetime = com_datetime;
	}
	
	
	

}
