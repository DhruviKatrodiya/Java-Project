package Entity;

import Entity.PaymentMaster;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T07:12:02")
@StaticMetamodel(PaymentDetail.class)
public class PaymentDetail_ { 

    public static volatile SingularAttribute<PaymentDetail, Integer> cvv;
    public static volatile SingularAttribute<PaymentDetail, Integer> paymentDetailId;
    public static volatile SingularAttribute<PaymentDetail, PaymentMaster> paymentId;
    public static volatile SingularAttribute<PaymentDetail, String> bankName;
    public static volatile SingularAttribute<PaymentDetail, String> ifscCode;

}