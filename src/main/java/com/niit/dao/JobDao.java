package com.niit.dao;

import com.niit.model.Job;

public interface JobDao 
{
	public boolean addJob(Job job);
	
	public String nextJobID();

}
