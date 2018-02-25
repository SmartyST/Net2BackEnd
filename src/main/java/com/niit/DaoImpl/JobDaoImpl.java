package com.niit.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.JobDao;
import com.niit.model.Job;

@Repository("jobDaoImpl")
@Transactional
public class JobDaoImpl implements JobDao
{
	@Autowired
	public SessionFactory sessionFactory;
	
	public JobDaoImpl()
	{
		System.out.println("JobDaoImpl Created");
	}

	public void addJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		session.save(job);
	}

}
