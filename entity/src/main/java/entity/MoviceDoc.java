package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MoviceDoc {
    private int did;
    private String dinfo;

    @Id
    @Column(name = "Did", nullable = false)
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "Dinfo", nullable = true, length = 500)
    public String getDinfo() {
        return dinfo;
    }

    public void setDinfo(String dinfo) {
        this.dinfo = dinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoviceDoc moviceDoc = (MoviceDoc) o;

        if (did != moviceDoc.did) return false;
        if (dinfo != null ? !dinfo.equals(moviceDoc.dinfo) : moviceDoc.dinfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = did;
        result = 31 * result + (dinfo != null ? dinfo.hashCode() : 0);
        return result;
    }
}
