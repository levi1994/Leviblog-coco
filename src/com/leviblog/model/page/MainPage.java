package com.leviblog.model.page;

import java.util.List;

import com.leviblog.orm.entity.Article;

/*
 * 用于定义Main页面包含数据的数据结构
 */
public class MainPage {
	//1.文章列表
	public List<Article> articleList;
	//2.最新文章
    public List<Article> newList;
	public List<Article> getArticleList() {
		return articleList;
	}
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	public List<Article> getNewList() {
		return newList;
	}
	public void setNewList(List<Article> newList) {
		this.newList = newList;
	}
    
}
