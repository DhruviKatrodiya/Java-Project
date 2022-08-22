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
@Table(name = "timelist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Timelist.findAll", query = "SELECT t FROM Timelist t"),
    @NamedQuery(name = "Timelist.findByTimelistId", query = "SELECT t FROM Timelist t WHERE t.timelistId = :timelistId"),
    @NamedQuery(name = "Timelist.findByTime", query = "SELECT t FROM Timelist t WHERE t.time = :time"),
    @NamedQuery(name = "Timelist.findByDay", query = "SELECT t FROM Timelist t WHERE t.day = :day")})
public class Timelist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "timelist_id")
    private Integer timelistId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "time")
    private String time;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "day")
    private String day;

    public Timelist() {
    }

    public Timelist(Integer timelistId) {
        this.timelistId = timelistId;
    }

    public Timelist(Integer timelistId, String time, String day) {
        this.timelistId = timelistId;
        this.time = time;
        this.day = day;
    }

    public Integer getTimelistId() {
        return timelistId;
    }

    public void setTimelistId(Integer timelistId) {
        this.timelistId = timelistId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timelistId != null ? timelistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Timelist)) {
            return false;
        }
        Timelist other = (Timelist) object;
        if ((this.timelistId == null && other.timelistId != null) || (this.timelistId != null && !this.timelistId.equals(other.timelistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Timelist[ timelistId=" + timelistId + " ]";
    }
    
}
