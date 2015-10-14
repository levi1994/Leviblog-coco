package com.leviblog.model.serviceImpl;
import java.util.List;

import com.leviblog.common.util.DateUtil;
import com.leviblog.common.util.IDUtil;
import com.leviblog.model.service.CommentService;
import com.leviblog.orm.dao.CommentDao;
import com.leviblog.orm.entity.Comment;

public class CommentServiceImpl implements CommentService {

	private CommentDao commentDao = new CommentDao();
	
	/*
	 * (non-Javadoc)
	 * @see com.leviblog.model.service.CommentService#commit(com.leviblog.orm.entity.Comment)
	 * 提交评论
	 */
	@Override
	public boolean commit(Comment c) {
		c.setCom_datetime(DateUtil.getDateTime());
		c.setCom_id("COM"+IDUtil.createId());
		System.out.println("正在提交评论");
		System.out.println(c.getCom_article_id());
		commentDao.add(c);
		return true;
	}
    
	/*
	 * (non-Javadoc)
	 * @see com.leviblog.model.service.CommentService#getComment(java.lang.String)
	 * 获取评论
	 */
	@Override
	public List<List<Comment>> getComment(String art_id) {
		return commentDao.getComments(art_id);
	}

}
