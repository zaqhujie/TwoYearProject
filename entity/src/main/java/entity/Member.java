package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    private int mid;
    private String husername;
    private String hpassword;
    private String hpicture;
    private String hname;
    private Integer hage;
    private String hsex;
    private String hstate;
    private Integer htime;
    private String hphone;
    private Double hmoney;

    @Id
    @Column(name = "Mid", nullable = false)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "Husername", nullable = true, length = 100)
    public String getHusername() {
        return husername;
    }

    public void setHusername(String husername) {
        this.husername = husername;
    }

    @Basic
    @Column(name = "Hpassword", nullable = true, length = 100)
    public String getHpassword() {
        return hpassword;
    }

    public void setHpassword(String hpassword) {
        this.hpassword = hpassword;
    }

    @Basic
    @Column(name = "Hpicture", nullable = true, length = 100)
    public String getHpicture() {
        return hpicture;
    }

    public void setHpicture(String hpicture) {
        this.hpicture = hpicture;
    }

    @Basic
    @Column(name = "Hname", nullable = true, length = 50)
    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Basic
    @Column(name = "Hage", nullable = true)
    public Integer getHage() {
        return hage;
    }

    public void setHage(Integer hage) {
        this.hage = hage;
    }

    @Basic
    @Column(name = "Hsex", nullable = true, length = 20)
    public String getHsex() {
        return hsex;
    }

    public void setHsex(String hsex) {
        this.hsex = hsex;
    }

    @Basic
    @Column(name = "Hstate", nullable = true, length = 1000)
    public String getHstate() {
        return hstate;
    }

    public void setHstate(String hstate) {
        this.hstate = hstate;
    }

    @Basic
    @Column(name = "Htime", nullable = true)
    public Integer getHtime() {
        return htime;
    }

    public void setHtime(Integer htime) {
        this.htime = htime;
    }

    @Basic
    @Column(name = "Hphone", nullable = true, length = 20)
    public String getHphone() {
        return hphone;
    }

    public void setHphone(String hphone) {
        this.hphone = hphone;
    }

    @Basic
    @Column(name = "Hmoney", nullable = true, precision = 0)
    public Double getHmoney() {
        return hmoney;
    }

    public void setHmoney(Double hmoney) {
        this.hmoney = hmoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (mid != member.mid) return false;
        if (husername != null ? !husername.equals(member.husername) : member.husername != null) return false;
        if (hpassword != null ? !hpassword.equals(member.hpassword) : member.hpassword != null) return false;
        if (hpicture != null ? !hpicture.equals(member.hpicture) : member.hpicture != null) return false;
        if (hname != null ? !hname.equals(member.hname) : member.hname != null) return false;
        if (hage != null ? !hage.equals(member.hage) : member.hage != null) return false;
        if (hsex != null ? !hsex.equals(member.hsex) : member.hsex != null) return false;
        if (hstate != null ? !hstate.equals(member.hstate) : member.hstate != null) return false;
        if (htime != null ? !htime.equals(member.htime) : member.htime != null) return false;
        if (hphone != null ? !hphone.equals(member.hphone) : member.hphone != null) return false;
        if (hmoney != null ? !hmoney.equals(member.hmoney) : member.hmoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (husername != null ? husername.hashCode() : 0);
        result = 31 * result + (hpassword != null ? hpassword.hashCode() : 0);
        result = 31 * result + (hpicture != null ? hpicture.hashCode() : 0);
        result = 31 * result + (hname != null ? hname.hashCode() : 0);
        result = 31 * result + (hage != null ? hage.hashCode() : 0);
        result = 31 * result + (hsex != null ? hsex.hashCode() : 0);
        result = 31 * result + (hstate != null ? hstate.hashCode() : 0);
        result = 31 * result + (htime != null ? htime.hashCode() : 0);
        result = 31 * result + (hphone != null ? hphone.hashCode() : 0);
        result = 31 * result + (hmoney != null ? hmoney.hashCode() : 0);
        return result;
    }
}
