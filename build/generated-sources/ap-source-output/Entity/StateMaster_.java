package Entity;

import Entity.CityMaster;
import Entity.Hostel;
import Entity.UserMaster;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(StateMaster.class)
public class StateMaster_ { 

    public static volatile CollectionAttribute<StateMaster, Hostel> hostelCollection;
    public static volatile SingularAttribute<StateMaster, String> stateName;
    public static volatile SingularAttribute<StateMaster, Integer> stateId;
    public static volatile CollectionAttribute<StateMaster, UserMaster> userMasterCollection;
    public static volatile CollectionAttribute<StateMaster, CityMaster> cityMasterCollection;

}