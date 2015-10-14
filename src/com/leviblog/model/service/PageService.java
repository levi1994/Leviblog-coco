package com.leviblog.model.service;

import com.leviblog.model.page.ArticlePage;
import com.leviblog.model.page.IndexPage;
import com.leviblog.model.page.MainPage;

/*
 * @author 李春
 * @time 2015-10-9
 * 这个接口用于定义页面获取和刷新的方式
 * 
 */
public interface PageService {
	
     /*获取index内容,返回一个包含所有页面数据的IndexPage对象*/
	public IndexPage getIndex();
	
	/*获取main内容，返回一个包含所有页面数据的MainPage对象*/
	public MainPage getMain();
	
	/*获取main内容，传入一个分类名称，返回一个包含所有页面数据的MainPage对象*/
	public MainPage getCategory(String art_type,int pageIndex);
	
	/* 获取article内容，返回一个包含所有页面数据的ArticlePage对象*/
	public ArticlePage getArticle(String art_id);

}
