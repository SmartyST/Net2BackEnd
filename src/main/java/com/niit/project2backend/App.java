package com.niit.project2backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DaoImpl.UserDaoImpl;
import com.niit.dao.UserDao;
import com.niit.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.*");
        context.refresh();
        UserDao userDao = (UserDao) context.getBean("userDaoImpl");*/
        
        /*User u = new User();
        u.setFirstname("som");
        u.setLastname("turde");
        u.setEmail("somturde@mail.com");
        u.setOnline(false);
        u.setPassword("qwerty");
        u.setPhone("12345679");
        u.setRole("Student");
        
        UserDao userDao = new UserDaoImpl();
        userDao.registerUser(u);
        System.out.println("Insert done");*/
        
    }
}
