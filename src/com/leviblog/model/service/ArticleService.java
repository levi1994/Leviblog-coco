package com.leviblog.model.service;

import com.leviblog.orm.entity.Article;

public interface ArticleService {
   /*
    * �Ķ�����,�Ķ�����+1
    */
	public Article read(String article_id);
	
	/*
	 * ϲ������,ϲ������+1
	 */
	public boolean like(String article_id);
	
	
}
