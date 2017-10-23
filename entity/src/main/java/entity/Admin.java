package entity;

import javax.persistence.*;

@Entity
public class Admin {
    private int aid;
    private String ausername;
    private String apassword;

    @Id
    @Column(name = "Aid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "Ausername", nullable = true, length = 100)
    public String getAusername() {
        return ausername;
    }

    public void setAusername(String ausername) {
        this.ausername = ausername;
    }

    @Basic
    @Column(name = "Apassword", nullable = true, length = 100)
    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (aid != admin.aid) return false;
        if (ausername != null ? !ausername.equals(admin.ausername) : admin.ausername != null) return false;
        if (apassword != null ? !apassword.equals(admin.apassword) : admin.apassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid;
        result = 31 * result + (ausername != null ? ausername.hashCode() : 0);
        result = 31 * result + (apassword != null ? apassword.hashCode() : 0);
        return result;
    }
}
