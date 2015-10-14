package com.leviblog.orm.dao;

import java.util.ArrayList;
import java.util.List;

import com.leviblog.orm.entity.Comment;

public class CommentDao extends CommonDao {
	/*
	 * 获取文章的所有评论
	 * 使用List<List<Comment>>存储
	 */
	public List<List<Comment>> getComments(String art_id){
		List<List<Comment>> list = new ArrayList<List<Comment>>();
		//获得所有一级评论
		List<Comment> father_comment = 
				getByCondition(" where com_article_id='"+art_id+" '  and com_depth=1 order by com_datetime ");
	    //为每一个评论添加子评论
		for(Comment c: father_comment){
			List<Comment> parentAndChild  = new ArrayList<Comment>();
			parentAndChild.add(c);
			//comments表示每个评论和他的子评论，第一个是父评论
			List<Comment> comments = 
					getByCondition(" where com_parent='"+c.getCom_id()+" '  and com_depth=2 order by com_datetime ");
			parentAndChild.addAll(comments);
			list.add(parentAndChild);
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<List<Comment>> list = new CommentDao().getComments("test1");
		System.out.println(list.get(2).size());
		Comment c = list.get(2).get(0);
		System.out.println(c.getCom_content());
	}
	
}
