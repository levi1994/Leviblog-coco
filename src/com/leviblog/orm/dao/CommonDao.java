package com.leviblog.orm.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.leviblog.orm.util.HibernateUtil;

public class CommonDao implements CommonInterface{
     public Class<? extends CommonDao> c;
	@Override
	public <E> boolean add(E e) {
		Session session = HibernateUtil.getSession();
		Transaction rx = session.beginTransaction();
		try{
		session.save(e);}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		rx.commit();
		session.close();
		return true;
	}
	
	@Override
	public <E> boolean delete(E e) {
		Session session = HibernateUtil.getSession();
		Transaction rx = session.beginTransaction();
		try {
			session.delete(e);
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
		rx.commit();
		session.close();
		return true;
	}
	
	//使用主键进行删除
	@Override
	public boolean delete(Serializable id){
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Object d = null;
		try {
			//获得实体类类名
			String classname = c.getName().replace("dao", "entity").replace("Dao", "");
			d =  session.get(Class.forName(classname), id);
			session.delete(d);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		tx.commit();
		session.close();
		return true;
	}
	
	@Override
	public<T> boolean delete(List<T> list){
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		for(Object o :list){
			try {
				session.delete(o);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		tx.commit();
		session.close();
		return true;
	}
	
	@Override
	public <E> boolean update(E e) {
		Session session = HibernateUtil.getSession();
		Transaction rx = session.beginTransaction();
		try {
			session.update(e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		rx.commit();
		session.close();
		return true;
	}
	@Override
	public boolean update(String hql){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		try{
		Query query = session.createQuery(hql);
		 query.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		tx.commit();
		session.close();
		return true;
	}
	
	@Override
	public <E> List<E> getByCondition(String sql) {
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		String name = c.getSimpleName();
		name = name.substring(0, name.length()-3);
		List<E> list=null ;
		try{
		Query query = session.createQuery("from "+name+"  "+sql);
		list =query.list();
		}catch(Exception e){
			System.out.println("hql语句出错："+"from "+name+"  "+sql);
		}
		tx.commit();
		session.close();
		return list;
	}
	@Override
	public <E> List<E> getByCondition(String sql,int pageSize,int page) {
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		String name = c.getSimpleName();
		name = name.substring(0, name.length()-3);
		List<E> list=null ;
		try{
			Query query = session.createQuery("from "+name+"  "+sql);
			query.setFirstResult((page-1)*pageSize); 
			query.setMaxResults(pageSize); 
			list =query.list();
		}catch(Exception e){
			System.out.println("hql语句出错："+"from "+name+"  "+sql);
		}
		tx.commit();
		session.close();
		return list;
	}
	
	
	@Override
	public Object get(Serializable id) {
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Object d = null;
		try {
			//获得实体类类名
			String classname = c.getName().replace("dao", "entity").replace("Dao", "");
			d =  session.get(Class.forName(classname), id);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		tx.commit();
		session.close();
		return d;
	}

	/**
	 * 完全使用Hql进行查询
	 * 适合自行进行复杂查询
	 */
	@Override
	public <E> List<E> getByHql(String hql,int pageSize,int page) {
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		List<E> list=null ;
		try{
		Query query = session.createQuery(hql);
		query.setFirstResult((page-1)*pageSize); 
		query.setMaxResults(pageSize); 
		list =query.list();
		}catch(Exception e){
			System.out.println("hql语句出错："+hql);
		}
		tx.commit();
		session.close();
		return list;
	}
	
	@Override
	public <E> List<E> getByHql(String hql) {
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		List<E> list=null ;
		try{
		Query query = session.createQuery(hql);
		list =query.list();
		}catch(Exception e){
			System.out.println("hql语句出错："+hql);
		}
		tx.commit();
		session.close();
		return list;
	}
	
	@Override
	public <E> List<E> get() {
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		String name = c.getSimpleName();
		name = name.substring(0, name.length()-3);
		Query query = session.createQuery("from "+name);
		List<E> list=null;
		try {
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		session.close();
		return list;
	}
	
	@Override
	public <E> List<E> get(int pageSize,int page) {
		this.c = this.getClass();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		String name = c.getSimpleName();
		name = name.substring(0, name.length()-3);
		Query query = session.createQuery("from "+name);
		query.setFirstResult((page-1)*pageSize); 
		query.setMaxResults(pageSize); 
		List<E> list=null;
		try {
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		session.close();
		return list;
	}
}
