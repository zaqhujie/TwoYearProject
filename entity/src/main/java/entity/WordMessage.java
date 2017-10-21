package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WordMessage {
    private int hwordMessageId;
    private String hwordMessage;

    @Id
    @Column(name = "HwordMessageID", nullable = false)
    public int getHwordMessageId() {
        return hwordMessageId;
    }

    public void setHwordMessageId(int hwordMessageId) {
        this.hwordMessageId = hwordMessageId;
    }

    @Basic
    @Column(name = "HwordMessage", nullable = true, length = 1000)
    public String getHwordMessage() {
        return hwordMessage;
    }

    public void setHwordMessage(String hwordMessage) {
        this.hwordMessage = hwordMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordMessage that = (WordMessage) o;

        if (hwordMessageId != that.hwordMessageId) return false;
        if (hwordMessage != null ? !hwordMessage.equals(that.hwordMessage) : that.hwordMessage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hwordMessageId;
        result = 31 * result + (hwordMessage != null ? hwordMessage.hashCode() : 0);
        return result;
    }
}
