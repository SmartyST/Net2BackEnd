package com.niit.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.JobDao;
import com.niit.model.Job;

public class JobDaoImpl implements JobDao
{

	@Autowired
	public SessionFactory sessionFactory;
	
	public JobDaoImpl(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}



	public boolean addJob(Job job) 
	{
		try 
		{
			job.setJob_id(this.nextJobID());
			if(job.getJob_salary() == null)
		{
			job.setJob_salary("Not Define");
		}
			sessionFactory.getCurrentSession().save(job);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}



	public String nextJobID() {
		// TODO Auto-generated method stub
		return null;
	}

}
