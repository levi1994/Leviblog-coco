package com.leviblog.model.page;

import java.util.ArrayList;
import java.util.List;

import com.leviblog.orm.entity.Article;

public class IndexPage {
	
	//�����б�0Ϊ������1Ϊ���2Ϊ����
	private ArrayList<List<Article>> articleList;

	public ArrayList<List<Article>> getArticleList() {
		return articleList;
	}

	public void setArticleList(ArrayList<List<Article>> articleList) {
		this.articleList = articleList;
	}
	
	

}
