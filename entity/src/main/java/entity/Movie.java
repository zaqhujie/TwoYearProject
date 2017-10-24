package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Movie {
    private int did;
    private Date dshowTime;
    private String dname;
    private Integer dtime;
    private String dtype;
    private Double dprice;

    @Id
    @Column(name = "Did", nullable = false)
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "DshowTime", nullable = true)
    public Date getDshowTime() {
        return dshowTime;
    }

    public void setDshowTime(Date dshowTime) {
        this.dshowTime = dshowTime;
    }

    @Basic
    @Column(name = "Dname", nullable = true, length = 50)
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "Dtime", nullable = true)
    public Integer getDtime() {
        return dtime;
    }

    public void setDtime(Integer dtime) {
        this.dtime = dtime;
    }

    @Basic
    @Column(name = "Dtype", nullable = true, length = 50)
    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    @Basic
    @Column(name = "Dprice", nullable = true, precision = 0)
    public Double getDprice() {
        return dprice;
    }

    public void setDprice(Double dprice) {
        this.dprice = dprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Movie movie = (Movie) o;

        if (did != movie.did) {
            return false;
        }
        if (dshowTime != null ? !dshowTime.equals(movie.dshowTime) : movie.dshowTime != null) {
            return false;
        }
        if (dname != null ? !dname.equals(movie.dname) : movie.dname != null) {
            return false;
        }
        if (dtime != null ? !dtime.equals(movie.dtime) : movie.dtime != null) {
            return false;
        }
        if (dtype != null ? !dtype.equals(movie.dtype) : movie.dtype != null) {
            return false;
        }
        if (dprice != null ? !dprice.equals(movie.dprice) : movie.dprice != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = did;
        result = 31 * result + (dshowTime != null ? dshowTime.hashCode() : 0);
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (dtime != null ? dtime.hashCode() : 0);
        result = 31 * result + (dtype != null ? dtype.hashCode() : 0);
        result = 31 * result + (dprice != null ? dprice.hashCode() : 0);
        return result;
    }
}
