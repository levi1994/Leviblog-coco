package com.leviblog.model.service;

import java.util.List;

import com.leviblog.orm.entity.Comment;

/*
 * @author
 * 提供评论服务的接口定义
 */
public interface CommentService {
	
    /*提交评论*/
	public boolean commit(Comment c);
    
	/*
	 * 获取某篇文章的评论
	 * 评论以一个ArrayList<ArrayList>返回,
	 * 其中每个ArrayList对象存储的额第一个值为一个评论，
	 * 后面的值是他的各个子评论
	 *
	 **/
	public List<List<Comment>> getComment(String art_id);
	
	
}
