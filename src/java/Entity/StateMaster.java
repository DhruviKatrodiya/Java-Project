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
@Table(name = "state_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StateMaster.findAll", query = "SELECT s FROM StateMaster s"),
    @NamedQuery(name = "StateMaster.findByStateId", query = "SELECT s FROM StateMaster s WHERE s.stateId = :stateId"),
    @NamedQuery(name = "StateMaster.findByStateName", query = "SELECT s FROM StateMaster s WHERE s.stateName = :stateName")})
public class StateMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "state_id")
    private Integer stateId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "state_name")
    private String stateName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<Hostel> hostelCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<CityMaster> cityMasterCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<UserMaster> userMasterCollection;

    public StateMaster() {
    }

    public StateMaster(Integer stateId) {
        this.stateId = stateId;
    }

    public StateMaster(Integer stateId, String stateName) {
        this.stateId = stateId;
        this.stateName = stateName;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @XmlTransient
    public Collection<Hostel> getHostelCollection() {
        return hostelCollection;
    }

    public void setHostelCollection(Collection<Hostel> hostelCollection) {
        this.hostelCollection = hostelCollection;
    }

    @XmlTransient
    public Collection<CityMaster> getCityMasterCollection() {
        return cityMasterCollection;
    }

    public void setCityMasterCollection(Collection<CityMaster> cityMasterCollection) {
        this.cityMasterCollection = cityMasterCollection;
    }

    @XmlTransient
    public Collection<UserMaster> getUserMasterCollection() {
        return userMasterCollection;
    }

    public void setUserMasterCollection(Collection<UserMaster> userMasterCollection) {
        this.userMasterCollection = userMasterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateId != null ? stateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StateMaster)) {
            return false;
        }
        StateMaster other = (StateMaster) object;
        if ((this.stateId == null && other.stateId != null) || (this.stateId != null && !this.stateId.equals(other.stateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.StateMaster[ stateId=" + stateId + " ]";
    }
    
}
