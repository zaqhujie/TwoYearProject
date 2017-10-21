package dao;

import entity.Admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.JDBCUtil;

public class LoginDao {
    public Admin queryById(int id){
        SessionFactory factory = JDBCUtil.getSessionFactory();
        Session s = factory.openSession();
        Transaction ts = s.getTransaction();
        ts.begin();
        Admin a = s.get(Admin.class,id);
        return a ;
    }
}
