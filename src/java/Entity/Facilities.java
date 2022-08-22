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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "facilities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facilities.findAll", query = "SELECT f FROM Facilities f"),
    @NamedQuery(name = "Facilities.findByFacilitiesId", query = "SELECT f FROM Facilities f WHERE f.facilitiesId = :facilitiesId"),
    @NamedQuery(name = "Facilities.findByFacilitiesDetail", query = "SELECT f FROM Facilities f WHERE f.facilitiesDetail = :facilitiesDetail")})
public class Facilities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "facilities_id")
    private Integer facilitiesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "facilities_detail")
    private String facilitiesDetail;
    @JoinColumn(name = "hostel_id", referencedColumnName = "hostel_id")
    @ManyToOne(optional = false)
    private Hostel hostelId;

    public Facilities() {
    }

    public Facilities(Integer facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public Facilities(Integer facilitiesId, String facilitiesDetail) {
        this.facilitiesId = facilitiesId;
        this.facilitiesDetail = facilitiesDetail;
    }

    public Integer getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(Integer facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public String getFacilitiesDetail() {
        return facilitiesDetail;
    }

    public void setFacilitiesDetail(String facilitiesDetail) {
        this.facilitiesDetail = facilitiesDetail;
    }

    public Hostel getHostelId() {
        return hostelId;
    }

    public void setHostelId(Hostel hostelId) {
        this.hostelId = hostelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilitiesId != null ? facilitiesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facilities)) {
            return false;
        }
        Facilities other = (Facilities) object;
        if ((this.facilitiesId == null && other.facilitiesId != null) || (this.facilitiesId != null && !this.facilitiesId.equals(other.facilitiesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Facilities[ facilitiesId=" + facilitiesId + " ]";
    }
    
}
