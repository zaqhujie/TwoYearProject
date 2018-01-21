package action;

import entity.Movie;
import org.apache.struts2.ServletActionContext;
import service.MoiveService;

import javax.servlet.ServletContextEvent;

public class MovieAction {
    private int maxDtime ;
    private int minDtime ;
    private String Dtype ;

    public int getMaxDtime() {
        return maxDtime;
    }

    public void setMaxDtime(int maxDtime) {
        this.maxDtime = maxDtime;
    }

    public int getMinDtime() {
        return minDtime;
    }

    public void setMinDtime(int minDtime) {
        this.minDtime = minDtime;
    }

    public String getDtype() {
        return Dtype;
    }

    public void setDtype(String dtype) {
        Dtype = dtype;
    }

    private String execute(){
        MoiveService service = new MoiveService();
        Movie m = service.quertMoive(minDtime,Dtype,maxDtime);
        ServletActionContext.getRequest().setAttribute("m",m);
        return "queryMoive-success" ;
    }
}
