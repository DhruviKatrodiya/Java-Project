package Entity;

import Entity.Booking;
import Entity.CityMaster;
import Entity.GroupMaster;
import Entity.StateMaster;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(UserMaster.class)
public class UserMaster_ { 

    public static volatile SingularAttribute<UserMaster, String> lastName;
    public static volatile SingularAttribute<UserMaster, String> fatherName;
    public static volatile SingularAttribute<UserMaster, Integer> pincode;
    public static volatile SingularAttribute<UserMaster, String> mOccupation;
    public static volatile SingularAttribute<UserMaster, String> address;
    public static volatile SingularAttribute<UserMaster, String> gender;
    public static volatile SingularAttribute<UserMaster, StateMaster> stateId;
    public static volatile SingularAttribute<UserMaster, String> fOccupation;
    public static volatile SingularAttribute<UserMaster, String> motherName;
    public static volatile SingularAttribute<UserMaster, String> photo;
    public static volatile SingularAttribute<UserMaster, CityMaster> cityId;
    public static volatile SingularAttribute<UserMaster, Integer> userId;
    public static volatile CollectionAttribute<UserMaster, Booking> bookingCollection;
    public static volatile CollectionAttribute<UserMaster, GroupMaster> groupMasterCollection;
    public static volatile SingularAttribute<UserMaster, String> phoneNo;
    public static volatile SingularAttribute<UserMaster, String> firstName;
    public static volatile SingularAttribute<UserMaster, String> password;
    public static volatile SingularAttribute<UserMaster, String> nationality;
    public static volatile SingularAttribute<UserMaster, String> dob;
    public static volatile SingularAttribute<UserMaster, String> userEmail;
    public static volatile SingularAttribute<UserMaster, String> fPhoneNo;
    public static volatile SingularAttribute<UserMaster, String> fEmail;
    public static volatile SingularAttribute<UserMaster, String> username;

}