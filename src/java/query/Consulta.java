/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import java.util.List;
import model.BillingData;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utilidades.NewHibernateUtil;

/**
 *
 * @author Administrador
 */
public class Consulta {
    public boolean isUser(User user){
        SessionFactory sesion=NewHibernateUtil.getSessionFactory();
        Session session=sesion.openSession();
        Query query=session.createQuery("FROM User WHERE email='"+user.getEmail()+"' and"
                + " password='"+user.getPassword()+"'");
        boolean isUser=query.list().isEmpty();//lo guardamos en una variable para luego cerrar la sesión
        session.close();
        return !isUser;
    }
    public String getRol(User user){
        SessionFactory sesion=NewHibernateUtil.getSessionFactory();
        Session session=sesion.openSession();
        Query query=session.createQuery("SELECT rol FROM User WHERE email='"+user.getEmail()+"'");
        List <String>rol=query.list();
        session.close();
        return rol.get(0);
    }
    public void addUser(User user){
        SessionFactory sesion=NewHibernateUtil.getSessionFactory();
        Session session=sesion.openSession();
        Transaction t=session.beginTransaction();
        session.save(user);
        t.commit();
        session.close();
    }
    public void deleteUser(User user){
        SessionFactory sesion=NewHibernateUtil.getSessionFactory();
        Session session=sesion.openSession();
        Transaction t=session.beginTransaction();
        session.delete(user);
        t.commit();
        session.close();
    }
    public void updateUser(User user){
        SessionFactory sesion=NewHibernateUtil.getSessionFactory();
        Session session=sesion.openSession();
        Transaction t=session.beginTransaction();
        session.update(user);
        t.commit();
        session.close();
    }
    public List <String> dataUser(User user){
        SessionFactory sesion=NewHibernateUtil.getSessionFactory();
        Session session=sesion.openSession();
        Query query=session.createQuery("SELECT b.dni, u.name, u.surname, u.email, u.phone, u.password, b.country, b.city, b.province, b.town, b.cp, b.number, b.stairs, b.floor, b.door FROM User u, BillingData b WHERE u.id=b.user and email='"+user.getEmail()+"'");
        //Query query=session.createQuery("SELECT b.dni FROM User u, BillingData b WHERE u.id=b.user and email='"+user.getEmail()+"'");
        List <String>rol=query.list();
        session.close();
        return rol;
    }
    
}
