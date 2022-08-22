package Entity;

import Entity.Hostel;
import Entity.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(CategoryMaster.class)
public class CategoryMaster_ { 

    public static volatile SingularAttribute<CategoryMaster, String> categoryType;
    public static volatile CollectionAttribute<CategoryMaster, Hostel> hostelCollection;
    public static volatile CollectionAttribute<CategoryMaster, Room> roomCollection;
    public static volatile SingularAttribute<CategoryMaster, Integer> categoryId;

}