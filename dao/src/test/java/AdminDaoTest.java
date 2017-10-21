import dao.AdminDao;
import entity.Admin;
import org.junit.Assert;
import org.junit.Test;

public class AdminDaoTest {
    @Test
    public void queryAdminByIdTest(){
        AdminDao dao = new AdminDao();
        Admin a = dao.queryAdminById(1);

        Assert.assertEquals(1,a.getAid());
    }

    @Test
    public void queryAdminTest(){
        AdminDao dao = new AdminDao();
        Admin a = dao.queryAdmin("boos","123456");
        Assert.assertEquals(1,a.getAid());
    }
}
