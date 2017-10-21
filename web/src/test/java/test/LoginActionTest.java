package test;


import action.LoginAction;
import com.opensymphony.xwork2.ActionProxy;
import org.apache.struts2.StrutsTestCase;
import org.junit.Assert;
import org.junit.Test;

public class LoginActionTest extends StrutsTestCase {


    @Test
    public void testLoginTest() throws Exception {


        request.setParameter("id","1");
        ActionProxy proxy = getActionProxy("/loginLogin");
        proxy.setExecuteResult(false);

        LoginAction action = (LoginAction) proxy.getAction();
        String result = proxy.execute();

         Assert.assertEquals("login-success",result);
    }
}
