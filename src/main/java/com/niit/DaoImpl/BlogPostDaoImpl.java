package com.niit.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.BlogPostDao;
import com.niit.model.BlogPost;

@Repository
@Transactional
public class BlogPostDaoImpl implements BlogPostDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public BlogPostDaoImpl()
	{
		System.out.println("BlogPostDaoImpl Created");
	}

	public void addBlogPost(BlogPost blogPost) 
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(blogPost);
	}

	public List<BlogPost> listOfBlogs(int approved) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from BlogPost where approved"+approved);
		List<BlogPost> blog=query.list();
		return blog;
	}

}
