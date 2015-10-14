package com.leviblog.model.service;

import com.leviblog.orm.entity.Article;

public interface ArticleService {
   /*
    * 阅读服务,阅读次数+1
    */
	public Article read(String article_id);
	
	/*
	 * 喜爱服务,喜爱次数+1
	 */
	public boolean like(String article_id);
	
	
}
