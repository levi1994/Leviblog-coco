package com.leviblog.model.page;

import java.util.List;
import com.leviblog.orm.entity.Article;
import com.leviblog.orm.entity.Comment;

/*
 * ��������ҳ������ݽṹ
 */
public class ArticlePage {
	//����
    public Article article;
    //�Ҳ���������
    public List<Article> newList;
    //����
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
