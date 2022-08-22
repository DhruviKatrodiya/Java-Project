package Entity;

import Entity.Booking;
import Entity.PaymentDetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(PaymentMaster.class)
public class PaymentMaster_ { 

    public static volatile CollectionAttribute<PaymentMaster, PaymentDetail> paymentDetailCollection;
    public static volatile SingularAttribute<PaymentMaster, String> paymentMode;
    public static volatile SingularAttribute<PaymentMaster, Integer> paymentId;
    public static volatile CollectionAttribute<PaymentMaster, Booking> bookingCollection;

}