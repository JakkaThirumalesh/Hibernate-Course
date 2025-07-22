package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //--------------------------------
//        Configuration cfg = new Configuration();
//        cfg.configure();
//        
//        SessionFactory factory = cfg.buildSessionFactory();
//        System.out.println(factory);
        
        //--------------------------------
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        System.out.println(factory);
        
        //--------------------------------
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        Student st = new Student();
        st.setId(1);
        st.setName("Aman");
        st.setEmail("aman@gmail.com");
        st.setAddress("India");
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        
        tx.commit();
        
        session.close();
    }
}
