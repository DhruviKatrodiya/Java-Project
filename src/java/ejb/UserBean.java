/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import Entity.Booking;
import Entity.CityMaster;
import Entity.Events;
import Entity.Feedback;
import Entity.GroupMaster;
import Entity.GroupMasterPK;
import Entity.Hostel;
import Entity.Notice;
import Entity.PaymentDetail;
import Entity.PaymentMaster;
import Entity.Room;
import Entity.Rules;
import Entity.StateMaster;
import Entity.Timelist;
import Entity.UserMaster;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;

/**
 *
 * @author meetk
 */
@Stateless
public class UserBean implements UserBeanLocal {
    
    @PersistenceContext(unitName = "OHS_PublishAppPU")
    EntityManager em;
    private Pbkdf2PasswordHashImpl pb;

    @Override
  
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


    public void addUserMaster(String username, String first_name, String last_name, String address, String phone_no, String dob, String gender, String photo, String user_email, String password, String father_name, String f_occupation, String f_phone_no, String f_email, String mother_name, String m_occupation, String nationality, Integer city_id, Integer state_id, Integer pincode, String user) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
        pb = new Pbkdf2PasswordHashImpl();
        String encryptedpassword = pb.generate(password.toCharArray());
        
        CityMaster city = em.find(CityMaster.class,city_id);
      StateMaster state = em.find(StateMaster.class,state_id);
      Collection<UserMaster> users = city.getUserMasterCollection();
      UserMaster um = new UserMaster();
      
      um.setUsername(username);
      um.setFirstName(first_name);
      um.setLastName(last_name);
      um.setAddress(address);
      um.setPhoneNo(phone_no);
      um.setDob(dob);
      um.setGender(gender);
      um.setPhoto(photo);
      um.setUserEmail(user_email);
      um.setPassword(encryptedpassword);
      um.setFatherName(father_name);
      um.setFOccupation(f_occupation);
      um.setFPhoneNo(f_phone_no);
      um.setFEmail(f_email);
      um.setMotherName(mother_name);
      um.setMOccupation(m_occupation);
      um.setNationality(nationality);
      um.setCityId(city);
      um.setStateId(state);
      um.setPincode(pincode);
      
      em.persist(um);
      users.add(um);
      city.setUserMasterCollection(users);
      em.merge(city);
      
      GroupMaster gm = new GroupMaster();
      gm.setGroupMasterPK(new GroupMasterPK("user",username));
      gm.setUserMaster(um);
      em.persist(gm);
      System.out.println("user Inserted !!!");
    }

    @Override
    public void updateUserMaster(Integer user_id, String first_name, String last_name, String address, String phone_no, String dob, String gender, String photo, String user_email, String password, String father_name, String f_occupation, String f_phone_no, String f_email, String mother_name, String m_occupation, String nationality, Integer city_id, Integer state_id, Integer pincode) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      CityMaster city = em.find(CityMaster.class, city_id);
      StateMaster state = em.find(StateMaster.class,state_id);
      UserMaster u = (UserMaster) em.createNamedQuery("UserMaster.findByUserId").setParameter("userId",user_id).getSingleResult();
      u.setFirstName(first_name);
      u.setLastName(last_name);
      u.setAddress(address);
      u.setPhoneNo(phone_no);
      u.setDob(dob);
      u.setGender(gender);
      u.setPhoto(photo);
      u.setUserEmail(user_email);
      u.setPassword(password);
      u.setFatherName(father_name);
      u.setFOccupation(f_occupation);
      u.setFPhoneNo(f_phone_no);
      u.setFEmail(f_email);
      u.setMotherName(mother_name);
      u.setMOccupation(m_occupation);
      u.setNationality(nationality);
      u.setCityId(city);
      u.setStateId(state);
      u.setPincode(pincode);
      em.merge(u);
    }

    @Override
    public Collection<UserMaster> getAllUserMasters() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return em.createNamedQuery("UserMaster.findAll").getResultList();
    }

    @Override
    public Collection<UserMaster> getUserMastersOfCityId(Integer city_id) {
         CityMaster city = em.find(CityMaster.class, city_id);
     	   return city.getUserMasterCollection();
    }

    @Override
    public Collection<UserMaster> getUserMastersOfStateId(Integer state_id) {
        
        StateMaster state = em.find(StateMaster.class, state_id);
     	return state.getUserMasterCollection();
    }

    @Override
    public UserMaster getUserMasterByUserName(String username) {
        UserMaster usermaster = em.find(UserMaster.class,username);
         return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByFirstName(String first_name) {
          Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByFirstName")
                                    .setParameter("firstName", first_name)
                                    .getResultList();
    return usermaster; 
    }

    @Override
    public Collection<UserMaster> getUserMastersByLastName(String last_name) {
      Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByLastname")
                                    .setParameter("lastName", last_name)
                                    .getResultList();
    
    return usermaster;
    }

    @Override
    public Collection<UserMaster> getUserMastersByAddress(String address) {
        Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByAddress")
                                    .setParameter("address", address)
                                    .getResultList();
    return usermaster;
    }

    @Override
    public Collection<UserMaster> getUserMastersByPhoneNo(String phone_no) {
     Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByPhoneno")
                                    .setParameter("phoneno", phone_no)
                                    .getResultList();
    
    return usermaster;
    }

     @Override
    public Collection<UserMaster> getUserMastersByDob(String dob) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByDOB")
                                    .setParameter("dob", dob)
                                    .getResultList();
    
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByGender(String gender) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByGender")
                                    .setParameter("gender", gender)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByPhoto(String photo) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByPhoto")
                                    .setParameter("Photo", photo)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByUserEmail(String user_email) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByUseremail")
                                    .setParameter("Useremail", user_email)
                                    .getResultList();
    return usermaster;
    
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByPassword(String password) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByPassword")
                                    .setParameter("Password", password)
                                    .getResultList();
    
    return usermaster;
    }

    @Override
    public Collection<UserMaster> getUserMastersByFatherName(String father_name) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByFathername")
                                    .setParameter("father_name",father_name)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByFOccupation(String f_occupation) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByFOccupation")
                                    .setParameter("foccupatione",f_occupation)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByFPhoneNo(String f_phone_no) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByFPhoneno")
                                    .setParameter("FPhoneno ",f_phone_no)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByFEmail(String f_email) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByFemail")
                                    .setParameter("Femail",f_email)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByMotherName(String mother_name) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByMothername")
                                    .setParameter("Mothername",mother_name)
                                    .getResultList();
    
    return usermaster;
    }

    @Override
    public Collection<UserMaster> getUserMastersByMOccupation(String m_occupation) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByMOccupation")
                                    .setParameter("MOccupation",m_occupation)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByNationality(String nationality) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByNationality")
                                    .setParameter("Nationality",nationality)
                                    .getResultList();
    
    return usermaster;
    
    }

    @Override
    public Collection<UserMaster> getUserMastersByPincode(Integer pincode) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    Collection<UserMaster> usermaster = em.createNamedQuery("UserMaster.findByPincode")
                                    .setParameter("Pincode",pincode)
                                    .getResultList();
    return usermaster;
    
    }

    @Override
    public UserMaster findUserMasterById(Integer user_id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    return em.find(UserMaster.class, user_id);
    
    
    }


    @Override
    public void addCityMasterToStateMaster(String city_name, Integer state_id) {
         StateMaster state = em.find(StateMaster.class, state_id);
      Collection<CityMaster> citys = state.getCityMasterCollection();
      CityMaster city = new CityMaster();
      city.setCityName(city_name);
      city.setStateId(state);
      citys.add(city);
      state.setCityMasterCollection(citys);
      em.persist(city);
      em.merge(state);
    }

    @Override
    public Collection<CityMaster> getAllCityMasters() {
        return em.createNamedQuery("CityMaster.findAll").getResultList();
    }

    @Override
    public Collection<CityMaster> getCityMasterOfStateId(Integer state_id) {
        StateMaster state = em.find(StateMaster.class, state_id);
        return state.getCityMasterCollection();
    }

    @Override
    public Collection<CityMaster> getCityMastersByCityName(String city_name) {
        Collection<CityMaster> citys = em.createNamedQuery("CityMaster.findByCityName").setParameter("CityName",city_name).getResultList();
        return citys;    
    
    }

    @Override
    public CityMaster findCityMasterById(Integer city_id) {
      return em.find(CityMaster.class,city_id);
    }

    @Override
    public void addStateMaster(String state_name) {
        StateMaster s = new StateMaster();
        s.setStateName(state_name);
        em.persist(s);
    
    }

    @Override
    public Collection<StateMaster> getAllStateMasters() {
        return em.createNamedQuery("StateMaster.findAll").getResultList();
    
    }

    @Override
    public Collection<StateMaster> getStateMastersByStateName(String state_name) {
        Collection<StateMaster> state = em.createNamedQuery("StateMaster.findByStateName")
                                    .setParameter("StateName", state_name)
                                    .getResultList();
    return state;
    }

    @Override
    public StateMaster findStateMasterById(Integer state_id) {
        return em.find(StateMaster.class, state_id);
    }

    @Override
  
    public void addBooking(Integer user_id,Integer room_id,Integer payment_id, String booking_date) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        UserMaster um = (UserMaster) em.createNamedQuery("UserMaster.findByUserId").setParameter("userId",user_id).getSingleResult();
        Collection<Booking> booking = um.getBookingCollection();
        Room rooms = em.find(Room.class,room_id);
        Collection<Booking> bookings = rooms.getBookingCollection();
        PaymentMaster pm = em.find(PaymentMaster.class,payment_id);
        Collection<Booking> bookingss = pm.getBookingCollection();
        Booking b = new Booking();
        b.setUserId(um);
        b.setRoomId(rooms);
        b.setPaymentId(pm);
        b.setBookingDate(booking_date);
        booking.add(b);
        um.setBookingCollection(booking);
        rooms.setBookingCollection(bookings);
        pm.setBookingCollection(bookingss);
        em.persist(b);
        em.merge(um);
        em.merge(rooms);
        em.merge(pm);

        
    }

    

    @Override
    public void updateBooking(Integer booking_id, Integer user_id, Integer room_id,Integer payment_id, String booking_date) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        UserMaster um = (UserMaster) em.createNamedQuery("UserMaster.findByUserId").setParameter("userId",user_id).getSingleResult();
        Room room = em.find(Room.class, room_id);
        PaymentMaster pm = em.find(PaymentMaster.class,payment_id);
        Booking b = em.find(Booking.class,booking_id);
        b.setUserId(um);
        b.setRoomId(room);
        b.setPaymentId(pm);
        b.setBookingDate(booking_date);
        em.merge(b);
    
    }

    @Override
    public Collection<Booking> getAllBookings() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        return em.createNamedQuery("Booking.findAll").getResultList();
    
    }

    @Override
    public Collection<Booking> getBookingsOfUserMaster(Integer user_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        UserMaster um = (UserMaster) em.createNamedQuery("UserMaster.findByUserId").setParameter("userId",user_id).getSingleResult();
        return um.getBookingCollection();
    
    }

    @Override
    public Collection<Booking> getBookingsOfRoom(Integer room_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        Room room = em.find(Room.class, room_id);
        return room.getBookingCollection();
    
    }
    
    @Override
    public Collection<Booking> getBookingsOfPaymentId(Integer payment_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        PaymentMaster pm = em.find(PaymentMaster.class, payment_id);
        return pm.getBookingCollection();
    
    }

    @Override
    public Collection<Booking> getBookingsByBookingDate(String booking_date) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        Collection<Booking> bookings = em.createNamedQuery("Booking.findByBookingdate").setParameter("booking_date",booking_date).getResultList();
        return bookings;
    
    }

    @Override
    public Booking findBookingById(Integer booking_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        return em.find(Booking.class,booking_id);
    }
    @Override
    public Collection<Hostel> getAllHostels() {
         return em.createNamedQuery("Hostel.findAll").getResultList();
    }

    @Override
    public Hostel findHostelById(Integer hostel_id) {
       return em.find(Hostel.class,hostel_id);
    }

    @Override
    public void addPaymentMaster(String payment_mode) {
     PaymentMaster p = new PaymentMaster();
        p.setPaymentMode(payment_mode);
        em.persist(p);   
    }

    @Override
    public Collection<PaymentMaster> getAllPaymentMasters() {
      return em.createNamedQuery("PaymentMaster.findAll").getResultList();
    }

    @Override
    public Collection<PaymentMaster> getPaymentMastersByPaymentMode(String payment_mode) {
       Collection<PaymentMaster> payment = em.createNamedQuery("PaymentMaster.findByPaymentMode").setParameter("PaymentMode",payment_mode).getResultList();
        return payment;
    }

    @Override
    public PaymentMaster findPaymentMasterById(Integer payment_id) {
        return em.find(PaymentMaster.class,payment_id);
    }

    @Override
    public void addPaymentDetail(Integer payment_id, Integer cvv, String bank_name, String ifsc_code) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
       PaymentMaster payment = em.find(PaymentMaster.class, payment_id);
      Collection<PaymentDetail> paymentdetails = payment.getPaymentDetailCollection();
      PaymentDetail paymentdetail = new PaymentDetail();
      paymentdetail.setPaymentId(payment);
      paymentdetail.setCvv(cvv);
      paymentdetail.setBankName(bank_name);
      paymentdetail.setIfscCode(ifsc_code);
      paymentdetails.add(paymentdetail);
      payment.setPaymentDetailCollection(paymentdetails);
      em.persist(paymentdetail);
      em.merge(payment);
    }

    @Override
    public Collection<PaymentDetail> getAllPaymentDetails() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
       return em.createNamedQuery("PaymentDetail.findAll").getResultList();

    }

    @Override
    public Collection<PaymentDetail> getPaymentDetailOfPaymentId(Integer payment_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        PaymentMaster payment = em.find(PaymentMaster.class, payment_id);
        return payment.getPaymentDetailCollection();

    }

    @Override
    public Collection<PaymentDetail> getPaymentDetailsByCvv(Integer cvv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
         Collection<PaymentDetail> paymentdetails = em.createNamedQuery("PaymentDetail.findByCvv").setParameter("Cvv",cvv).getResultList();
        return paymentdetails;
    

    }

    @Override
    public Collection<PaymentDetail> getPaymentDetailsByBankName(String bank_name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Collection<PaymentDetail> paymentdetails = em.createNamedQuery("PaymentDetail.findByBankName").setParameter("BankName",bank_name).getResultList();
        return paymentdetails;
  
    }

    @Override
    public Collection<PaymentDetail> getPaymentDetailsByIfscCode(String ifsc_code) {
      
        Collection<PaymentDetail> paymentdetails = em.createNamedQuery("PaymentDetail.findByIfscCode").setParameter("IfscCode",ifsc_code).getResultList();
        return paymentdetails;
   
    }

    @Override
    public PaymentDetail findPaymentDetailById(Integer payment_detail_id) {
     return em.find(PaymentDetail.class,payment_detail_id);
  }

    @Override
    public Collection<Room> getAllRooms() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return em.createNamedQuery("Room.findAll").getResultList();
    }

    @Override
    public Room findRoomById(Integer room_id) {
         return em.find(Room.class,room_id);
    
    }

    @Override
    public Collection<Events> getAllEvents() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return em.createNamedQuery("Events.findAll").getResultList();
    }

    @Override
    public Events findEventsById(Integer event_id) {
         return em.find(Events.class, event_id);
    }

    @Override
    public Collection<Notice> getAllNotice() {
    
        return em.createNamedQuery("Notice.findAll").getResultList();  
    }

    @Override
    public Notice findNoticeById(Integer notice_id) {
        return em.find(Notice.class,notice_id);
    
    }

    @Override
    public Collection<Rules> getAllRules() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return em.createNamedQuery("Rules.findAll").getResultList();
    
    }

    @Override
    public Rules findRulesById(Integer rules_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return em.find(Rules.class, rules_id);
    }

    @Override
    public Collection<Timelist> getAllTimelist() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return em.createNamedQuery("Rules.findAll").getResultList();
    }

    @Override
    public Timelist findTimelistById(Integer timelist_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return em.find(Timelist.class, timelist_id);
    
    }

    @Override
    public void addFeedback(String comments) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Feedback f = new Feedback();
       f.setComments(comments);
       em.persist(f);
    }

    
    @Override
    public Collection<Feedback> getAllFeedback() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
         return em.createNamedQuery("Feedback.findAll").getResultList();
    
    }

    @Override
    public Feedback findFeedbackById(Integer feedback_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        return em.find(Feedback.class,feedback_id);
    
    }

    @Override
    public Collection<Feedback> getFeedbackByComments(String comments) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
