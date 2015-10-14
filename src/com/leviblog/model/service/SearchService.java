package com.leviblog.model.service;

import java.util.List;

import com.leviblog.orm.entity.Article;

public interface SearchService {
   /*
    * кякВндуб
    */
	public List<Article> search(String key);
	
}
