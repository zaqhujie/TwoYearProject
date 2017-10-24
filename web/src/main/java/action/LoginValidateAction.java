package action;
import javax.servlet.http.HttpSession;

import entity.Admin;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import service.AdminService;

public class LoginValidateAction extends ActionSupport
{
    private String checkCode;
    private String ausername ;
    private String apassword ;

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

    public String getCheckCode()
    {
        return checkCode;
    }

    public void setCheckCode(String checkCode)
    {
        this.checkCode = checkCode;
    }

    @Override
    public String execute() throws Exception
    {
        AdminService service = new AdminService();
        Admin a = service.queryAdmin(ausername,apassword);
        if(a==null){
            return "login-default";
        }else{
            ServletActionContext.getRequest().setAttribute("admin",a);
            return "login-success" ;
        }
    }

    @Override
    public void validate()
    {
        HttpSession session = ServletActionContext.getRequest().getSession();

        String checkCode2 = (String)session.getAttribute("checkCode");

        if(!checkCode.equals(checkCode2))
        {
            this.addActionError("输入的验证码不正确，请重新输入！");
        }
    }
}
