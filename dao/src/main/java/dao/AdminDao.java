package dao;

import entity.Admin;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.JDBCUtil;

import java.util.ArrayList;
import java.util.List;
public class AdminDao {
    public void addAdmin(Admin a){
        Session s = JDBCUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(a);
        t.commit();
        s.close();
    }

    public void deleteAdmin(int aid){
        Session s = JDBCUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        t.begin();
        String hql = "delete Admin where aid = ?";
        Query q = s.createQuery(hql);
        q.setParameter(0,aid);
        q.executeUpdate();
        t.commit();
    }

    public void updateAdmin(Admin a){
        Session s = JDBCUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        t.begin();
        String hql = "update Admin set ausername = ?,apassword = ? where aid = ? ";
        Query q = s.createQuery(hql);
        q.setParameter(0,a.getAusername());
        q.setParameter(1,a.getApassword());
        q.setParameter(2,a.getAid());
        q.executeUpdate();
        t.commit();
    }

    public List<Admin> queryAllAdmin(){
        List<Admin> list = new ArrayList<Admin>();
        Session s = JDBCUtil.getSessionFactory().openSession();
        Transaction ts = s.getTransaction();
        String hql = "from Admin" ;
        Query q = s.createQuery(hql);
        list = q.list();
        return list ;
    }

    public Admin queryAdminById(int aid){
        Session s = JDBCUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        Admin hj = s.get(Admin.class,aid);
        return hj ;
    }

    public Admin queryAdmin(String ausername, String apassword){
        Session s = JDBCUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        String hql = "from Admin where ausername = ? and apassword = ?" ;
        Query q = s.createQuery(hql);
        q.setParameter(0,ausername);
        q.setParameter(1,apassword);

        List<Admin> list = q.getResultList();
        Admin admin = null ;
        if(!list.isEmpty()){
            for (Admin a : list) {
                admin = a ;
            }
        }
        return admin ;
    }
}
