package Entity;

import Entity.Hostel;
import Entity.StateMaster;
import Entity.UserMaster;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(CityMaster.class)
public class CityMaster_ { 

    public static volatile CollectionAttribute<CityMaster, Hostel> hostelCollection;
    public static volatile SingularAttribute<CityMaster, String> cityName;
    public static volatile SingularAttribute<CityMaster, StateMaster> stateId;
    public static volatile CollectionAttribute<CityMaster, UserMaster> userMasterCollection;
    public static volatile SingularAttribute<CityMaster, Integer> cityId;

}