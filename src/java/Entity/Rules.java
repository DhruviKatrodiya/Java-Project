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
@Table(name = "rules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rules.findAll", query = "SELECT r FROM Rules r"),
    @NamedQuery(name = "Rules.findByRulesId", query = "SELECT r FROM Rules r WHERE r.rulesId = :rulesId"),
    @NamedQuery(name = "Rules.findByDescription", query = "SELECT r FROM Rules r WHERE r.description = :description")})
public class Rules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rules_id")
    private Integer rulesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "description")
    private String description;

    public Rules() {
    }

    public Rules(Integer rulesId) {
        this.rulesId = rulesId;
    }

    public Rules(Integer rulesId, String description) {
        this.rulesId = rulesId;
        this.description = description;
    }

    public Integer getRulesId() {
        return rulesId;
    }

    public void setRulesId(Integer rulesId) {
        this.rulesId = rulesId;
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
        hash += (rulesId != null ? rulesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rules)) {
            return false;
        }
        Rules other = (Rules) object;
        if ((this.rulesId == null && other.rulesId != null) || (this.rulesId != null && !this.rulesId.equals(other.rulesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Rules[ rulesId=" + rulesId + " ]";
    }
    
}
