package com.leviblog.model.serviceImpl;

import java.util.List;

import com.leviblog.model.service.SearchService;
import com.leviblog.orm.dao.ArticleDao;
import com.leviblog.orm.entity.Article;

public class SearchServiceImpl implements SearchService {

	 private ArticleDao dao = new ArticleDao();
	@Override
	public List<Article> search(String key) {
		System.out.println("---------------------------------");
		System.out.println(key);
		System.out.println("---------------------------------");
		List<Article> articleList = dao.getByCondition(" where art_title like '%"+key+"%'", 6, 1);
		System.out.println("搜索到"+articleList.size()+"各结果");
		// TODO Auto-generated method stub
		return articleList;
	}
	
}
