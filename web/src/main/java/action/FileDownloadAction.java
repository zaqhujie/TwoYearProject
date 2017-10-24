package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

public class FileDownloadAction extends ActionSupport
{
    public InputStream getDownloadFile()
    {
        return ServletActionContext.getServletContext().getResourceAsStream("WEB-INF/test.txt");
    }

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }
}
