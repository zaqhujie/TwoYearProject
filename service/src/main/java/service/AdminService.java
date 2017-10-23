package service;

import dao.AdminDao;
import entity.Admin;

import java.util.List;

public class AdminService {
    public void addAdmin(Admin a){
        AdminDao dao = new AdminDao();
        dao.addAdmin(a);
    }

    public String deleteAdmin(int aid){
        String s = null ;
        AdminDao dao = new AdminDao();
        Admin a = dao.queryAdminById(aid);
        if(a==null){
            s = "此用户不存在" ;
        }else{
            dao.deleteAdmin(aid);
        }
        return s ;
    }

    public void updateAdmin(Admin a){
        AdminDao dao = new AdminDao();
        dao.updateAdmin(a);
    }

    public List<Admin> queryAllAdmin(){
        AdminDao dao = new AdminDao();
        List<Admin> list = dao.queryAllAdmin();
        return list ;
    }

    public Admin queryAdminById(int aid){
        AdminDao dao = new AdminDao();
        Admin a = dao.queryAdminById(aid);
        return a ;
    }

    public Admin queryAdmin(String ausername, String aupassword){
        AdminDao dao = new AdminDao();
        Admin a = dao.queryAdmin(ausername,aupassword);
        Admin admin = null ;
        if(a==null){
            return null ;
        }else{
            return a ;
        }
    }
}
