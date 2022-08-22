package Entity;

import Entity.PaymentMaster;
import Entity.Room;
import Entity.UserMaster;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(Booking.class)
public class Booking_ { 

    public static volatile SingularAttribute<Booking, PaymentMaster> paymentId;
    public static volatile SingularAttribute<Booking, String> bookingDate;
    public static volatile SingularAttribute<Booking, UserMaster> userId;
    public static volatile SingularAttribute<Booking, Integer> bookingId;
    public static volatile SingularAttribute<Booking, Room> roomId;

}