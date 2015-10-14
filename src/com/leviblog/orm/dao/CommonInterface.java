package com.leviblog.orm.dao;

import java.io.Serializable;
import java.util.List;

public interface CommonInterface {
	//����
	public <E> boolean  add(E e);
   //ɾ��
	public <E> boolean delete(E e);
	public boolean delete(Serializable id);
	//ɾ�����������е�ֵ����Ҫ��Ϊ���Ż�����
	public<T> boolean delete(List<T> list);
	//����
	public <E> boolean update(E e);
	public boolean update(String hql);
	//��ѯ
	//��ѯ����
	public  <E> List<E> get();
	public <E> List<E> get(int pageSize,int page);
	
	//��ָ��������ѯ
	public <E> List<E> getByCondition(String sql);
	public <E> List<E> getByCondition(String sql,int pageSize,int page);
	
	//ʹ��������ѯ
	public Object get(Serializable id);
	
	//��ȫʹ��hql����ѯ
	public <E> List <E> getByHql(String hql);
	public <E> List <E> getByHql(String hql,int pageSize,int page);
}
