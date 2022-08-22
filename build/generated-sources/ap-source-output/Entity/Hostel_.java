package Entity;

import Entity.CategoryMaster;
import Entity.CityMaster;
import Entity.Facilities;
import Entity.Room;
import Entity.StateMaster;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(Hostel.class)
public class Hostel_ { 

    public static volatile SingularAttribute<Hostel, String> hostelName;
    public static volatile SingularAttribute<Hostel, Integer> hostelId;
    public static volatile SingularAttribute<Hostel, StateMaster> stateId;
    public static volatile CollectionAttribute<Hostel, Room> roomCollection;
    public static volatile SingularAttribute<Hostel, CityMaster> cityId;
    public static volatile SingularAttribute<Hostel, String> phoneNo;
    public static volatile SingularAttribute<Hostel, CategoryMaster> categoryId;
    public static volatile CollectionAttribute<Hostel, Facilities> facilitiesCollection;

}