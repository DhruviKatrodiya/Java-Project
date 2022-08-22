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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "user_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserMaster.findAll", query = "SELECT u FROM UserMaster u"),
    @NamedQuery(name = "UserMaster.findByUserId", query = "SELECT u FROM UserMaster u WHERE u.userId = :userId"),
    @NamedQuery(name = "UserMaster.findByUsername", query = "SELECT u FROM UserMaster u WHERE u.username = :username"),
    @NamedQuery(name = "UserMaster.findByFirstName", query = "SELECT u FROM UserMaster u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "UserMaster.findByLastName", query = "SELECT u FROM UserMaster u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "UserMaster.findByAddress", query = "SELECT u FROM UserMaster u WHERE u.address = :address"),
    @NamedQuery(name = "UserMaster.findByPhoneNo", query = "SELECT u FROM UserMaster u WHERE u.phoneNo = :phoneNo"),
    @NamedQuery(name = "UserMaster.findByDob", query = "SELECT u FROM UserMaster u WHERE u.dob = :dob"),
    @NamedQuery(name = "UserMaster.findByGender", query = "SELECT u FROM UserMaster u WHERE u.gender = :gender"),
    @NamedQuery(name = "UserMaster.findByPhoto", query = "SELECT u FROM UserMaster u WHERE u.photo = :photo"),
    @NamedQuery(name = "UserMaster.findByUserEmail", query = "SELECT u FROM UserMaster u WHERE u.userEmail = :userEmail"),
    @NamedQuery(name = "UserMaster.findByFatherName", query = "SELECT u FROM UserMaster u WHERE u.fatherName = :fatherName"),
    @NamedQuery(name = "UserMaster.findByFOccupation", query = "SELECT u FROM UserMaster u WHERE u.fOccupation = :fOccupation"),
    @NamedQuery(name = "UserMaster.findByFPhoneNo", query = "SELECT u FROM UserMaster u WHERE u.fPhoneNo = :fPhoneNo"),
    @NamedQuery(name = "UserMaster.findByFEmail", query = "SELECT u FROM UserMaster u WHERE u.fEmail = :fEmail"),
    @NamedQuery(name = "UserMaster.findByMotherName", query = "SELECT u FROM UserMaster u WHERE u.motherName = :motherName"),
    @NamedQuery(name = "UserMaster.findByMOccupation", query = "SELECT u FROM UserMaster u WHERE u.mOccupation = :mOccupation"),
    @NamedQuery(name = "UserMaster.findByNationality", query = "SELECT u FROM UserMaster u WHERE u.nationality = :nationality"),
    @NamedQuery(name = "UserMaster.findByPincode", query = "SELECT u FROM UserMaster u WHERE u.pincode = :pincode")})
public class UserMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "phone_no")
    private String phoneNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "dob")
    private String dob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "photo")
    private String photo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "user_email")
    private String userEmail;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "father_name")
    private String fatherName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "f_occupation")
    private String fOccupation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "f_phone_no")
    private String fPhoneNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "f_email")
    private String fEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "mother_name")
    private String motherName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "m_occupation")
    private String mOccupation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nationality")
    private String nationality;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pincode")
    private int pincode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Booking> bookingCollection;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne(optional = false)
    private CityMaster cityId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne(optional = false)
    private StateMaster stateId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userMaster")
    private Collection<GroupMaster> groupMasterCollection;

    public UserMaster() {
    }

    public UserMaster(String username) {
        this.username = username;
    }

    public UserMaster(String username, int userId, String firstName, String lastName, String address, String phoneNo, String dob, String gender, String photo, String userEmail, String password, String fatherName, String fOccupation, String fPhoneNo, String fEmail, String motherName, String mOccupation, String nationality, int pincode) {
        this.username = username;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.gender = gender;
        this.photo = photo;
        this.userEmail = userEmail;
        this.password = password;
        this.fatherName = fatherName;
        this.fOccupation = fOccupation;
        this.fPhoneNo = fPhoneNo;
        this.fEmail = fEmail;
        this.motherName = motherName;
        this.mOccupation = mOccupation;
        this.nationality = nationality;
        this.pincode = pincode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFOccupation() {
        return fOccupation;
    }

    public void setFOccupation(String fOccupation) {
        this.fOccupation = fOccupation;
    }

    public String getFPhoneNo() {
        return fPhoneNo;
    }

    public void setFPhoneNo(String fPhoneNo) {
        this.fPhoneNo = fPhoneNo;
    }

    public String getFEmail() {
        return fEmail;
    }

    public void setFEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMOccupation() {
        return mOccupation;
    }

    public void setMOccupation(String mOccupation) {
        this.mOccupation = mOccupation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @XmlTransient
    public Collection<Booking> getBookingCollection() {
        return bookingCollection;
    }

    public void setBookingCollection(Collection<Booking> bookingCollection) {
        this.bookingCollection = bookingCollection;
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

    @XmlTransient
    public Collection<GroupMaster> getGroupMasterCollection() {
        return groupMasterCollection;
    }

    public void setGroupMasterCollection(Collection<GroupMaster> groupMasterCollection) {
        this.groupMasterCollection = groupMasterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserMaster)) {
            return false;
        }
        UserMaster other = (UserMaster) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.UserMaster[ username=" + username + " ]";
    }
    
}
