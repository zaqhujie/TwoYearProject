package action;

import entity.Admin;
import org.apache.struts2.ServletActionContext;
import service.AdminService;

import javax.servlet.Servlet;
import java.util.List;

public class LoginAction {
    private int aid ;
    private String ausername ;
    private String apassword ;
    private Admin a ;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAusername() {
        return ausername;
    }

    public void setAusername(String ausername) {
        this.ausername = ausername;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public Admin getA() {
        return a;
    }

    public void setA(Admin a) {
        this.a = a;
    }


    public String login(){
        AdminService service = new AdminService();
        Admin a = service.queryAdmin(ausername,apassword);
        if(a!=null){
            ServletActionContext.getRequest().setAttribute("admin",a);
            return "login-success" ;
        }else{
            return "login-default";
        }
    }

    public String register(){
        AdminService service = new AdminService();
        String s = service.addAdmin(a);
        if(s==null){
            return "add-success" ;
        }else{
            return "add-default" ;
        }
    }

    public String queryAll(){
        AdminService service = new AdminService();
        List<Admin> list = service.queryAllAdmin();
        ServletActionContext.getRequest().setAttribute("list",list);
        return "queryAll-success" ;
    }

    public String queryAdminById(){
        AdminService service = new AdminService();
        Admin a = service.queryAdminById(aid);
        ServletActionContext.getRequest().setAttribute("admin",a);
        return "queryById-success" ;
    }

    public String deleteAdmin() {
        AdminService service = new AdminService();
        service.deleteAdmin(aid);
        return "delete-success";
    }

    public String updateAdmin(){
        AdminService service = new AdminService();
        String s = service.updateAdmin(a);
        if(s==null){
            return "update-default" ;
        }else{
            return "update-success" ;
        }
    }

}
