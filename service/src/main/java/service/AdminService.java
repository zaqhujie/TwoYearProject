package service;

import dao.AdminDao;
import dao.LoginDao;
import entity.Admin;

import java.util.List;

public class AdminService {
    public String addAdmin(Admin a){
        String s = null ;
        AdminDao dao = new AdminDao();
        Admin admin = dao.queryAdminById(a.getAid());
        if(admin==null){
            dao.addAdmin(a);
        }else{
            s = "此用户已经存在" ;
        }
        return s ;
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

    public String updateAdmin(Admin a){
        String s = null ;
        AdminDao dao = new AdminDao();
        Admin admin = dao.queryAdminById(a.getAid());
        if(admin==null){
            s = "此用户不存在" ;
        }else{
            dao.updateAdmin(a);
        }
        return s ;
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

    public Admin queryAdmin(String ausername,String aupassword){
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
