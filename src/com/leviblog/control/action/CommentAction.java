package com.leviblog.control.action;

import com.leviblog.model.serviceImpl.CommentServiceImpl;
import com.leviblog.orm.entity.Comment;
import com.opensymphony.xwork2.Action;

public class CommentAction implements Action{
    private Comment comment;
    private CommentServiceImpl service = new CommentServiceImpl();
	@Override
	public String execute() throws Exception {
		return null;
	}
	
	/*
	 * 将评论写入数据库
	 */
	public String leaveComment(){
		service.commit(comment);
		return "success";
	}
	
	
	
	

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	
   
}
