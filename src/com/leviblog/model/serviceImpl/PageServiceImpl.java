package com.leviblog.model.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import com.leviblog.model.page.ArticlePage;
import com.leviblog.model.page.IndexPage;
import com.leviblog.model.page.MainPage;
import com.leviblog.model.service.PageService;
import com.leviblog.orm.dao.ArticleDao;
import com.leviblog.orm.dao.CommentDao;
import com.leviblog.orm.entity.Article;
import com.leviblog.orm.entity.Comment;

public class PageServiceImpl implements PageService{
	
    private final int PAGESIZE = 6;
	private ArticleDao articleDao = new ArticleDao();
	private CommentDao commentDao = new CommentDao();
	
	@Override
	public IndexPage getIndex() {
		ArrayList<List<Article>> articleList = new ArrayList<List<Article>>();
		//1.������з�����Ϣ
		List<Article>  technology = articleDao.getByCondition(" where art_type='����' ",PAGESIZE,1);
		List<Article>  life = articleDao.getByCondition(" where art_type='����'",PAGESIZE,1);
		List<Article>  download  = articleDao.getByCondition(" where art_type='����'",PAGESIZE,1);
		//2.�������ķ�����Ϣ����
		articleList.add(technology);
		articleList.add(life);
		articleList.add(download);
		//3.����indexҳ��
		IndexPage index = new IndexPage();
		index.setArticleList(articleList);
		//4.����
		return index;
	}

	@Override
	public MainPage getMain() {
		MainPage main = new MainPage();
		//��ȡ���·��������
		List<Article> articleList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//��ȡ�����б�
		List<Article> newList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//��ȡ���·���
		main.setArticleList(articleList);
		main.setNewList(newList);
		return main;
	}

	@Override
	public MainPage getCategory(String art_type,int pageIndex) {
		MainPage main = new MainPage();
		//��ȡ���·��������
		List<Article> articleList = articleDao.getByCondition(" where art_type='"+art_type+"' order by art_datetime desc", PAGESIZE, pageIndex);
		//��ȡ�����б�
		List<Article> newList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//��ȡ���·���
		main.setArticleList(articleList);
		main.setNewList(newList);
		return main;
	}

	@Override
	public ArticlePage getArticle(String art_id) {
		ArticlePage art = new ArticlePage();
		Article article = (Article) articleDao.get(art_id);
		List<Article> newList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//��������
		List<List<Comment>> commentList =  
				commentDao.getComments(art_id);
		art.setArticle(article);
		art.setNewList(newList);
		art.setCommentList(commentList);
		return art;
	}
	


}
