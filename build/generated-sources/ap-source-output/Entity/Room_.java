package Entity;

import Entity.Booking;
import Entity.CategoryMaster;
import Entity.Hostel;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Boolean> roomStatus;
    public static volatile SingularAttribute<Room, Integer> roomPrice;
    public static volatile SingularAttribute<Room, Hostel> hostelId;
    public static volatile SingularAttribute<Room, Integer> noOfStudent;
    public static volatile CollectionAttribute<Room, Booking> bookingCollection;
    public static volatile SingularAttribute<Room, Integer> roomId;
    public static volatile SingularAttribute<Room, String> roomType;
    public static volatile SingularAttribute<Room, CategoryMaster> categoryId;

}