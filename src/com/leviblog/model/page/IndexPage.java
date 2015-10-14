package com.leviblog.model.page;

import java.util.ArrayList;
import java.util.List;

import com.leviblog.orm.entity.Article;

public class IndexPage {
	
	//文章列表，0为技术，1为生活，2为下载
	private ArrayList<List<Article>> articleList;

	public ArrayList<List<Article>> getArticleList() {
		return articleList;
	}

	public void setArticleList(ArrayList<List<Article>> articleList) {
		this.articleList = articleList;
	}
	
	

}
