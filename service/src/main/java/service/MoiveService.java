package service;

import dao.MovieDao;
import entity.Movie;

public class MoiveService {
    public Movie quertMoive(int minDtime, String Dtype,int maxDtime){
        MovieDao dao = new MovieDao();
        Movie m = dao.queryMovieBydtimeAnddtype(minDtime,Dtype,maxDtime);
        return m ;
    }
}
