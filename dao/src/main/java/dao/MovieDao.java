package dao;

import entity.Movie;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.JDBCUtil;

import java.util.List;

public class MovieDao {
    public Movie queryMovieBydtimeAnddtype(int minDtime, String Dtype,int maxDtime){
        Session session = JDBCUtil.getSessionFactory().openSession();
        String sql = "from Movie m where dtype = ? and (dtime >? and dtime<?)" ;
        Transaction t = session.getTransaction();
        t.begin();
        Query q = session.createQuery(sql);
        q.setParameter(0,Dtype);
        q.setParameter(1,minDtime);
        q.setParameter(2,maxDtime);
        List<Movie> list = q.list();
        Movie movie = new Movie();
        if(!list.isEmpty()){
            for (Movie m: list
                    ) {
                movie = m ;
            }
        }
        return movie ;
    }
}
