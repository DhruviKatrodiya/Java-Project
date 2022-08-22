/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author meetk
 */
@Entity
@Table(name = "hostel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hostel.findAll", query = "SELECT h FROM Hostel h"),
    @NamedQuery(name = "Hostel.findByHostelId", query = "SELECT h FROM Hostel h WHERE h.hostelId = :hostelId"),
    @NamedQuery(name = "Hostel.findByHostelName", query = "SELECT h FROM Hostel h WHERE h.hostelName = :hostelName"),
    @NamedQuery(name = "Hostel.findByPhoneNo", query = "SELECT h FROM Hostel h WHERE h.phoneNo = :phoneNo")})
public class Hostel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hostel_id")
    private Integer hostelId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "hostel_name")
    private String hostelName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "phone_no")
    private String phoneNo;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne(optional = false)
    private CityMaster cityId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne(optional = false)
    private StateMaster stateId;
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne(optional = false)
    private CategoryMaster categoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hostelId")
    private Collection<Room> roomCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hostelId")
    private Collection<Facilities> facilitiesCollection;

    public Hostel() {
    }

    public Hostel(Integer hostelId) {
        this.hostelId = hostelId;
    }

    public Hostel(Integer hostelId, String hostelName, String phoneNo) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.phoneNo = phoneNo;
    }

    public Integer getHostelId() {
        return hostelId;
    }

    public void setHostelId(Integer hostelId) {
        this.hostelId = hostelId;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public CityMaster getCityId() {
        return cityId;
    }

    public void setCityId(CityMaster cityId) {
        this.cityId = cityId;
    }

    public StateMaster getStateId() {
        return stateId;
    }

    public void setStateId(StateMaster stateId) {
        this.stateId = stateId;
    }

    public CategoryMaster getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryMaster categoryId) {
        this.categoryId = categoryId;
    }

    @XmlTransient
    public Collection<Room> getRoomCollection() {
        return roomCollection;
    }

    public void setRoomCollection(Collection<Room> roomCollection) {
        this.roomCollection = roomCollection;
    }

    @XmlTransient
    public Collection<Facilities> getFacilitiesCollection() {
        return facilitiesCollection;
    }

    public void setFacilitiesCollection(Collection<Facilities> facilitiesCollection) {
        this.facilitiesCollection = facilitiesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hostelId != null ? hostelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hostel)) {
            return false;
        }
        Hostel other = (Hostel) object;
        if ((this.hostelId == null && other.hostelId != null) || (this.hostelId != null && !this.hostelId.equals(other.hostelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Hostel[ hostelId=" + hostelId + " ]";
    }
    
}
