package com.hiber;

import org.hibernate.SessionFactory;
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
        System.out.println(factory);
        
        
    }
}
