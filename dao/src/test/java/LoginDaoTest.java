import dao.LoginDao;
import entity.Admin;
import org.junit.Assert;
import org.junit.Test;


public class LoginDaoTest {
    @Test
    public void queryByIdTest(){
        LoginDao dao = new LoginDao();
        int id = 1 ;
        Admin a = dao.queryById(id);

        Assert.assertEquals(1,a.getAid());
    }
}
