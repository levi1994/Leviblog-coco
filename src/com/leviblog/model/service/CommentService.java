package com.leviblog.model.service;

import java.util.List;

import com.leviblog.orm.entity.Comment;

/*
 * @author
 * �ṩ���۷���Ľӿڶ���
 */
public interface CommentService {
	
    /*�ύ����*/
	public boolean commit(Comment c);
    
	/*
	 * ��ȡĳƪ���µ�����
	 * ������һ��ArrayList<ArrayList>����,
	 * ����ÿ��ArrayList����洢�Ķ��һ��ֵΪһ�����ۣ�
	 * �����ֵ�����ĸ���������
	 *
	 **/
	public List<List<Comment>> getComment(String art_id);
	
	
}
