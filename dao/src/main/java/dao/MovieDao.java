package dao;

import org.hibernate.Session;
import util.JDBCUtil;

public class MovieDao {
    public void queryMovieBydtimeAnddtype(int dtime,String type){
        Session session = JDBCUtil.getSessionFactory().openSession();

    }
}
