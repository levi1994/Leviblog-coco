package com.leviblog.model.page;

import java.util.List;

import com.leviblog.orm.entity.Article;

/*
 * ���ڶ���Mainҳ��������ݵ����ݽṹ
 */
public class MainPage {
	//1.�����б�
	public List<Article> articleList;
	//2.��������
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
