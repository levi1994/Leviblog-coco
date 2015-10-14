package com.leviblog.model.service;

import com.leviblog.model.page.ArticlePage;
import com.leviblog.model.page.IndexPage;
import com.leviblog.model.page.MainPage;

/*
 * @author �
 * @time 2015-10-9
 * ����ӿ����ڶ���ҳ���ȡ��ˢ�µķ�ʽ
 * 
 */
public interface PageService {
	
     /*��ȡindex����,����һ����������ҳ�����ݵ�IndexPage����*/
	public IndexPage getIndex();
	
	/*��ȡmain���ݣ�����һ����������ҳ�����ݵ�MainPage����*/
	public MainPage getMain();
	
	/*��ȡmain���ݣ�����һ���������ƣ�����һ����������ҳ�����ݵ�MainPage����*/
	public MainPage getCategory(String art_type,int pageIndex);
	
	/* ��ȡarticle���ݣ�����һ����������ҳ�����ݵ�ArticlePage����*/
	public ArticlePage getArticle(String art_id);

}
