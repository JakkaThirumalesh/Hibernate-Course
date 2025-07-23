package com.hiber;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        System.out.println(factory);
       
        Employee emp = new Employee();
        
        emp.setEmpName("ujjwal");
        emp.setEmail("ujjwal@gmail.com");
        emp.setSalary(10000.0);
        emp.setStatus("Active");
        emp.setJoiningDate(new Date());
        emp.setToken("A123");
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(emp);
        
        tx.commit();
        
        session.close();
    }
}
