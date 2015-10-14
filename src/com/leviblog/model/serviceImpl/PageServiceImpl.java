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
		//1.获得所有分类信息
		List<Article>  technology = articleDao.getByCondition(" where art_type='技术' ",PAGESIZE,1);
		List<Article>  life = articleDao.getByCondition(" where art_type='生活'",PAGESIZE,1);
		List<Article>  download  = articleDao.getByCondition(" where art_type='下载'",PAGESIZE,1);
		//2.将所欲的分类信息加入
		articleList.add(technology);
		articleList.add(life);
		articleList.add(download);
		//3.设置index页面
		IndexPage index = new IndexPage();
		index.setArticleList(articleList);
		//4.返回
		return index;
	}

	@Override
	public MainPage getMain() {
		MainPage main = new MainPage();
		//获取最新发表的文章
		List<Article> articleList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//获取文章列表
		List<Article> newList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//获取文章分类
		main.setArticleList(articleList);
		main.setNewList(newList);
		return main;
	}

	@Override
	public MainPage getCategory(String art_type,int pageIndex) {
		MainPage main = new MainPage();
		//获取最新发表的文章
		List<Article> articleList = articleDao.getByCondition(" where art_type='"+art_type+"' order by art_datetime desc", PAGESIZE, pageIndex);
		//获取文章列表
		List<Article> newList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//获取文章分类
		main.setArticleList(articleList);
		main.setNewList(newList);
		return main;
	}

	@Override
	public ArticlePage getArticle(String art_id) {
		ArticlePage art = new ArticlePage();
		Article article = (Article) articleDao.get(art_id);
		List<Article> newList = articleDao.getByCondition(" order by art_datetime desc", PAGESIZE, 1);
		//加载评论
		List<List<Comment>> commentList =  
				commentDao.getComments(art_id);
		art.setArticle(article);
		art.setNewList(newList);
		art.setCommentList(commentList);
		return art;
	}
	


}
