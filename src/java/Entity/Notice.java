/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author meetk
 */
@Entity
@Table(name = "notice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notice.findAll", query = "SELECT n FROM Notice n"),
    @NamedQuery(name = "Notice.findByNoticeId", query = "SELECT n FROM Notice n WHERE n.noticeId = :noticeId"),
    @NamedQuery(name = "Notice.findByDescription", query = "SELECT n FROM Notice n WHERE n.description = :description")})
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "notice_id")
    private Integer noticeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "description")
    private String description;

    public Notice() {
    }

    public Notice(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Notice(Integer noticeId, String description) {
        this.noticeId = noticeId;
        this.description = description;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noticeId != null ? noticeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notice)) {
            return false;
        }
        Notice other = (Notice) object;
        if ((this.noticeId == null && other.noticeId != null) || (this.noticeId != null && !this.noticeId.equals(other.noticeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Notice[ noticeId=" + noticeId + " ]";
    }
    
}
