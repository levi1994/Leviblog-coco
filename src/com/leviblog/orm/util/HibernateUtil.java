package com.leviblog.orm.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static ServiceRegistry serviceRegistry = null;
	 private static Configuration cfg = null;
	 private static SessionFactory sessionFactory = null;
	 
	 static {
	  cfg = new Configuration().configure();
	  serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
	  sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	  }

	public static Session getSession() {
		Session session = null;
		if (null == session || false == session.isOpen()) {
			session = sessionFactory.openSession();
		}

		return session;
	}

	public static void closeSession(Session session) {
		try {
			if (null != session && session.isOpen())
				session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
