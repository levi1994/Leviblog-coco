package com.leviblog.model.page;

import java.util.List;
import com.leviblog.orm.entity.Article;
import com.leviblog.orm.entity.Comment;

/*
 * 定义文章页面的数据结构
 */
public class ArticlePage {
	//文章
    public Article article;
    //右侧最新文章
    public List<Article> newList;
    //评论
    public List<List<Comment>> commentList;
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public List<Article> getNewList() {
		return newList;
	}
	public void setNewList(List<Article> newList) {
		this.newList = newList;
	}
	public List<List<Comment>> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<List<Comment>> commentList) {
		this.commentList = commentList;
	}
    
}
