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
@Table(name = "payment_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentDetail.findAll", query = "SELECT p FROM PaymentDetail p"),
    @NamedQuery(name = "PaymentDetail.findByPaymentDetailId", query = "SELECT p FROM PaymentDetail p WHERE p.paymentDetailId = :paymentDetailId"),
    @NamedQuery(name = "PaymentDetail.findByCvv", query = "SELECT p FROM PaymentDetail p WHERE p.cvv = :cvv"),
    @NamedQuery(name = "PaymentDetail.findByBankName", query = "SELECT p FROM PaymentDetail p WHERE p.bankName = :bankName"),
    @NamedQuery(name = "PaymentDetail.findByIfscCode", query = "SELECT p FROM PaymentDetail p WHERE p.ifscCode = :ifscCode")})
public class PaymentDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_detail_id")
    private Integer paymentDetailId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cvv")
    private int cvv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "bank_name")
    private String bankName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "ifsc_code")
    private String ifscCode;
    @JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
    @ManyToOne(optional = false)
    private PaymentMaster paymentId;

    public PaymentDetail() {
    }

    public PaymentDetail(Integer paymentDetailId) {
        this.paymentDetailId = paymentDetailId;
    }

    public PaymentDetail(Integer paymentDetailId, int cvv, String bankName, String ifscCode) {
        this.paymentDetailId = paymentDetailId;
        this.cvv = cvv;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
    }

    public Integer getPaymentDetailId() {
        return paymentDetailId;
    }

    public void setPaymentDetailId(Integer paymentDetailId) {
        this.paymentDetailId = paymentDetailId;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public PaymentMaster getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(PaymentMaster paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentDetailId != null ? paymentDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentDetail)) {
            return false;
        }
        PaymentDetail other = (PaymentDetail) object;
        if ((this.paymentDetailId == null && other.paymentDetailId != null) || (this.paymentDetailId != null && !this.paymentDetailId.equals(other.paymentDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.PaymentDetail[ paymentDetailId=" + paymentDetailId + " ]";
    }
    
}
