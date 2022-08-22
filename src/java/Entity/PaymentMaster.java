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
@Table(name = "payment_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentMaster.findAll", query = "SELECT p FROM PaymentMaster p"),
    @NamedQuery(name = "PaymentMaster.findByPaymentId", query = "SELECT p FROM PaymentMaster p WHERE p.paymentId = :paymentId"),
    @NamedQuery(name = "PaymentMaster.findByPaymentMode", query = "SELECT p FROM PaymentMaster p WHERE p.paymentMode = :paymentMode")})
public class PaymentMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_id")
    private Integer paymentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "payment_mode")
    private String paymentMode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentId")
    private Collection<Booking> bookingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentId")
    private Collection<PaymentDetail> paymentDetailCollection;

    public PaymentMaster() {
    }

    public PaymentMaster(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentMaster(Integer paymentId, String paymentMode) {
        this.paymentId = paymentId;
        this.paymentMode = paymentMode;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @XmlTransient
    public Collection<Booking> getBookingCollection() {
        return bookingCollection;
    }

    public void setBookingCollection(Collection<Booking> bookingCollection) {
        this.bookingCollection = bookingCollection;
    }

    @XmlTransient
    public Collection<PaymentDetail> getPaymentDetailCollection() {
        return paymentDetailCollection;
    }

    public void setPaymentDetailCollection(Collection<PaymentDetail> paymentDetailCollection) {
        this.paymentDetailCollection = paymentDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentMaster)) {
            return false;
        }
        PaymentMaster other = (PaymentMaster) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.PaymentMaster[ paymentId=" + paymentId + " ]";
    }
    
}
