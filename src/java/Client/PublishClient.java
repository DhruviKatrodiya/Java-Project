/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/JerseyClient.java to edit this template
 */
package Client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:OHSResource [OHS]<br>
 * USAGE:
 * <pre>
 *        PublishClient client = new PublishClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author meetk
 */
public class PublishClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/OHS_PublishApp/webresources";

    public PublishClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("OHS");
    }

    public <T> T findPaymentDetailById(Class<T> responseType, String PaymentDetailId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findPaymentDetailById/{0}", new Object[]{PaymentDetailId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getHostelsOfCityId(Class<T> responseType, String CityId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getHostelsOfCityId/{0}", new Object[]{CityId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllPaymentMasters(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllPaymentMasters");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removeRoom(String RoomId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeRoom/{0}", new Object[]{RoomId})).request().delete();
    }

    public <T> T getUserMastersByDob(Class<T> responseType, String dob) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByDob/{0}", new Object[]{dob}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByFEmail(Class<T> responseType, String FEmail) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByFEmail/{0}", new Object[]{FEmail}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByUserEmail(Class<T> responseType, String UserEmail) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByUserEmail/{0}", new Object[]{UserEmail}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateStateMaster(String StateId, String StateName) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateStateMaster/{0}/{1}", new Object[]{StateId, StateName})).request().put(null);
    }

    public void removeRules(String RulesId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeRules/{0}", new Object[]{RulesId})).request().delete();
    }

    public <T> T getUserMastersByPassword(Class<T> responseType, String Password) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByPassword/{0}", new Object[]{Password}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateCategoryMaster(String CategoryId, String CategoryType) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateCategoryMaster/{0}/{1}", new Object[]{CategoryId, CategoryType})).request().put(null);
    }

    public <T> T getAllTimelist(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllTimelist");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllRooms(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllRooms");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllRules(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllRules");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllStateMasters(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllStateMasters");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateRoom(String RoomId, String RoomType, String CategoryId, String HostelId, String RoomPrice, String RoomStatus, String NoOfStudent) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateRoom/{0}/{1}/{2}/{3}/{4}/{5}/{6}", new Object[]{RoomId, RoomType, CategoryId, HostelId, RoomPrice, RoomStatus, NoOfStudent})).request().put(null);
    }

    public void addEvents(String EventName, String Description) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addEvents/{0}/{1}", new Object[]{EventName, Description})).request().post(null);
    }

    public void updateNotice(String NoticeId, String Description) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateNotice/{0}/{1}", new Object[]{NoticeId, Description})).request().put(null);
    }

    public <T> T getUserMastersByLastName(Class<T> responseType, String LastName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByLastName/{0}", new Object[]{LastName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removeNotice(String NoticeId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeNotice/{0}", new Object[]{NoticeId})).request().delete();
    }

    public void removeBooking(String BookingId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeBooking/{0}", new Object[]{BookingId})).request().delete();
    }

    public void removeCategoryMaster(String CategoryId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("delCategoryMaster/{0}", new Object[]{CategoryId})).request().delete();
    }

    public <T> T findFeedbackById(Class<T> responseType, String FeedbackId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findFeedbackById/{0}", new Object[]{FeedbackId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByFatherName(Class<T> responseType, String FatherName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByFatherName/{0}", new Object[]{FatherName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getHostelsByHostelName(Class<T> responseType, String HostelName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getHostelsByHostelName/{0}", new Object[]{HostelName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getBookingsOfRoom(Class<T> responseType, String RoomId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getBookingsOfRoom/{0}", new Object[]{RoomId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getTimelistByTime(Class<T> responseType, String Time) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getTimelistByTime/{0}", new Object[]{Time}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getRoomsByRoomType(Class<T> responseType, String RoomType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getRoomsByRoomType/{0}", new Object[]{RoomType}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getRoomsByNoOfStudent(Class<T> responseType, String NoOfStudent) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getRoomsByNoOfStudent/{0}", new Object[]{NoOfStudent}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void addStateMaster(String StateName) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addStateMaster/{0}", new Object[]{StateName})).request().post(null);
    }

    public <T> T findStateMasterById(Class<T> responseType, String StateId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findStateMasterById/{0}", new Object[]{StateId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getPaymentMastersByPaymentMode(Class<T> responseType, String PaymentMode) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getPaymentMastersByPaymentMode/{0}", new Object[]{PaymentMode}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removeStateMaster(String StateId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeStateMaster/{0}", new Object[]{StateId})).request().delete();
    }

    public void addUserMaster(String Username, String FirstName, String LastName, String Address, String PhoneNo, String Dob, String Gender, String Photo, String UserEmail, String Password, String FatherName, String FOccupation, String FPhoneNo, String FEmail, String MotherName, String MOccupation, String Nationality, String CityId, String StateId, String Pincode, String Admin) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addUserMaster/{0}/{1}/{2}/{3}/{4}/{5}/{6}/{7}/{8}/{9}/{10}/{11}/{12}/{13}/{14}/{15}/{16}/{17}/{18}/{19}/{20}", new Object[]{Username, FirstName, LastName, Address, PhoneNo, Dob, Gender, Photo, UserEmail, Password, FatherName, FOccupation, FPhoneNo, FEmail, MotherName, MOccupation, Nationality, CityId, StateId, Pincode, Admin})).request().post(null);
    }

    public <T> T getUserMastersByPhoto(Class<T> responseType, String Photo) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByPhoto/{0}", new Object[]{Photo}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findUserMasterById(Class<T> responseType, String userId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findUserMasterById/{0}", new Object[]{userId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getStateMastersByStateName(Class<T> responseType, String StateName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getStateMastersByStateName/{0}", new Object[]{StateName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void putXml(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML));
    }

    public <T> T getHostelsOfStateId(Class<T> responseType, String StateId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getHostelsOfStateId/{0}", new Object[]{StateId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void addHostel(String HostelName, String CityId, String StateId, String PhoneNo, String CategoryId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addHostel/{0}/{1}/{2}/{3}/{4}", new Object[]{HostelName, CityId, StateId, PhoneNo, CategoryId})).request().post(null);
    }

    public void addCityMaster(String CityName, String StateId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addCityMasterToStateMaster/{0}/{1}", new Object[]{CityName, StateId})).request().post(null);
    }

    public <T> T findCategoryMasterById(Class<T> responseType, String CategoryId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findCategoryMasterById/{0}", new Object[]{CategoryId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findHostelById(Class<T> responseType, String HostelId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findHostelById/{0}", new Object[]{HostelId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updatePaymentMaster(String PaymentId, String PaymentMode) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updatePaymentMaster/{0}/{1}", new Object[]{PaymentId, PaymentMode})).request().put(null);
    }

    public <T> T getAllCategoryMasters(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllCategoryMasters");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getPaymentDetailOfPaymentId(Class<T> responseType, String PaymentId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getPaymentDetailOfPaymentId/{0}", new Object[]{PaymentId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getBookingsOfUserMaster(Class<T> responseType, String userId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getBookingsOfUserMaster/{0}", new Object[]{userId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getRoomsByRoomtStatus(Class<T> responseType, String RoomStatus) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getRoomsByRoomtStatus/{0}", new Object[]{RoomStatus}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateEvents(String EventId, String EventName, String Description) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateEvents/{0}/{1}/{2}", new Object[]{EventId, EventName, Description})).request().put(null);
    }

    public <T> T getEventsByEventName(Class<T> responseType, String EventName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getEventsByEventName/{0}", new Object[]{EventName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByPincode(Class<T> responseType, String Pincode) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByPincode/{0}", new Object[]{Pincode}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByFOccupation(Class<T> responseType, String FOccupation) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByFOccupation/{0}", new Object[]{FOccupation}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public String getXml() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public <T> T getRulesByDescription(Class<T> responseType, String Description) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getRulesByDescription/{0}", new Object[]{Description}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findEventsById(Class<T> responseType, String EventId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findEventsById/{0}", new Object[]{EventId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllCityMasters(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllCityMasters");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updatePaymentDetail(String PaymentDetailId, String PaymentId, String Cvv, String BankName, String IfscCode) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updatePaymentDetail/{0}/{1}/{2}/{3}/{4}", new Object[]{PaymentDetailId, PaymentId, Cvv, BankName, IfscCode})).request().put(null);
    }

    public <T> T getCityMasterOfStateId(Class<T> responseType, String StateId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getCityMasterOfStateId/{0}", new Object[]{StateId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void addRules(String Description) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addRules/{0}", new Object[]{Description})).request().post(null);
    }

    public <T> T findRulesById(Class<T> responseType, String RulesId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findRulesById/{0}", new Object[]{RulesId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findRoomById(Class<T> responseType, String RoomId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findRoomById/{0}", new Object[]{RoomId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllBookings(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllBookings");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMasterByUserName(Class<T> responseType, String Username) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMasterByUserName/{0}", new Object[]{Username}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByGender(Class<T> responseType, String Gender) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByGender/{0}", new Object[]{Gender}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void addTimelist(String Time, String Day) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addTimelist/{0}/{1}", new Object[]{Time, Day})).request().post(null);
    }

    public <T> T findNoticeById(Class<T> responseType, String NoticeId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findNoticeById/{0}", new Object[]{NoticeId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllEvents(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllEvents");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getPaymentDetailsByCvv(Class<T> responseType, String Cvv) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getPaymentDetailsByCvv/{0}", new Object[]{Cvv}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getTimelistByDay(Class<T> responseType, String Day) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getTimelistByDay/{0}", new Object[]{Day}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateHostel(String HostelId, String HostelName, String CityId, String StateId, String PhoneNo, String CategoryId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateHostel/{0}/{1}/{2}/{3}/{4}/{5}", new Object[]{HostelId, HostelName, CityId, StateId, PhoneNo, CategoryId})).request().put(null);
    }

    public <T> T getEventsByDescription(Class<T> responseType, String Description) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getEventsByDescription/{0}", new Object[]{Description}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void addRoom(String RoomType, String CategoryId, String HostelId, String RoomPrice, String RoomStatus, String NoOfStudent) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addRoom/{0}/{1}/{2}/{3}/{4}/{5}", new Object[]{RoomType, CategoryId, HostelId, RoomPrice, RoomStatus, NoOfStudent})).request().post(null);
    }

    public void updateCityMaster(String CityId, String CityName, String StateId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateCityMaster/{0}/{1}/{2}", new Object[]{CityId, CityName, StateId})).request().put(null);
    }

    public <T> T findTimelistById(Class<T> responseType, String TimelistId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findTimelistById/{0}", new Object[]{TimelistId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removeTimelist(String TimelistId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeTimelist/{0}", new Object[]{TimelistId})).request().delete();
    }

    public <T> T getCategoryMastersByCategoryType(Class<T> responseType, String CategoryType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getCategoryMastersByCategoryType/{0}", new Object[]{CategoryType}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removeFeedback(String FeedbackId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeFeedback/{0}", new Object[]{FeedbackId})).request().delete();
    }

    public void addPaymentMaster(String PaymentMode) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addPaymentMaster/{0}", new Object[]{PaymentMode})).request().post(null);
    }

    public void removeCityMaster(String CityId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeCityMasterToStateMaster/{0}", new Object[]{CityId})).request().delete();
    }

    public <T> T getUserMastersOfCityId(Class<T> responseType, String CityId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersOfCityId/{0}", new Object[]{CityId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getRoomsByRoomPrice(Class<T> responseType, String RoomPrice) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getRoomsByRoomPrice/{0}", new Object[]{RoomPrice}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findPaymentMasterById(Class<T> responseType, String PaymentId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findPaymentMasterById/{0}", new Object[]{PaymentId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateUserMaster(String userId, String FirstName, String LastName, String Address, String PhoneNo, String Dob, String Gender, String Photo, String UserEmail, String Password, String FatherName, String FOccupation, String FPhoneNo, String FEmail, String MotherName, String MOccupation, String Nationality, String CityId, String StateId, String Pincode) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateUserMaster/{0}/{1}/{2}/{3}/{4}/{5}/{6}/{7}/{8}/{9}/{10}/{11}/{12}/{13}/{14}/{15}/{16}/{17}/{18}/{19}", new Object[]{userId, FirstName, LastName, Address, PhoneNo, Dob, Gender, Photo, UserEmail, Password, FatherName, FOccupation, FPhoneNo, FEmail, MotherName, MOccupation, Nationality, CityId, StateId, Pincode})).request().put(null);
    }

    public <T> T getUserMastersOfStateId(Class<T> responseType, String StateId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersOfStateId/{0}", new Object[]{StateId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removePaymentMaster(String PaymentId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removePaymentMaster/{0}", new Object[]{PaymentId})).request().delete();
    }

    public <T> T getPaymentDetailsByBankName(Class<T> responseType, String BankName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getPaymentDetailsByBankName/{0}", new Object[]{BankName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByPhoneNo(Class<T> responseType, String PhoneNo) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByPhoneNo/{0}", new Object[]{PhoneNo}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateRules(String RulesId, String Description) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateRules/{0}/{1}", new Object[]{RulesId, Description})).request().put(null);
    }

    public void addCategoryMaster(String CategoryType) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addCategoryMaster/{0}", new Object[]{CategoryType})).request().post(null);
    }

    public <T> T getAllHostels(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllHostels");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getPaymentDetailsByIfscCode(Class<T> responseType, String IfscCode) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getPaymentDetailsByIfscCode/{0}", new Object[]{IfscCode}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void updateTimelist(String TimelistId, String Time, String Day) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateTimelist/{0}/{1}/{2}", new Object[]{TimelistId, Time, Day})).request().put(null);
    }

    public <T> T getRoomsOfCategoryId(Class<T> responseType, String CategoryId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getRoomsOfCategoryId/{0}", new Object[]{CategoryId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllNotice(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllNotice");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getHostelsOfCategoryId(Class<T> responseType, String CategoryId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getHostelsOfCategoryId/{0}", new Object[]{CategoryId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllUserMasters(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllUserMasters");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByNationality(Class<T> responseType, String Nationality) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByNationality/{0}", new Object[]{Nationality}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getBookingsByBookingDate(Class<T> responseType, String BookingDate) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getBookingsByBookingDate/{0}", new Object[]{BookingDate}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void addPaymentDetail(String PaymentId, String Cvv, String BankName, String IfscCode) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addPaymentDetailToPaymentMaster/{0}/{1}/{2}/{3}", new Object[]{PaymentId, Cvv, BankName, IfscCode})).request().post(null);
    }

    public <T> T findBookingById(Class<T> responseType, String BookingId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findBookingById/{0}", new Object[]{BookingId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getHostelsByPhoneNo(Class<T> responseType, String PhoneNo) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getHostelsByPhoneNo/{0}", new Object[]{PhoneNo}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByMotherName(Class<T> responseType, String MotherName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByMotherName/{0}", new Object[]{MotherName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllPaymentDetails(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllPaymentDetails");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getAllFeedback(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getAllFeedback");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getNoticeByDescription(Class<T> responseType, String Description) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getNoticeByDescription/{0}", new Object[]{Description}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void addBooking(String userId, String RoomId, String PaymentId, String BookingDate) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addBooking/{0}/{1}/{2}/{3}", new Object[]{userId, RoomId, PaymentId, BookingDate})).request().post(null);
    }

    public void updateBooking(String BookingId, String userId, String RoomId, String PaymentId, String BookingDate) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("updateBooking/{0}/{1}/{2}/{3}/{4}", new Object[]{BookingId, userId, RoomId, PaymentId, BookingDate})).request().put(null);
    }

    public void removeUserMaster(String userId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeUserMaster/{0}", new Object[]{userId})).request().delete();
    }

    public <T> T getBookingsOfPaymentId(Class<T> responseType, String PaymentId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getBookingsOfPaymentId/{0}", new Object[]{PaymentId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removeHostel(String HostelId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeHostel/{0}", new Object[]{HostelId})).request().delete();
    }

    public void addNotice(String Description) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addNotice/{0}", new Object[]{Description})).request().post(null);
    }

    public void removeEvents(String EventId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeEvents/{0}", new Object[]{EventId})).request().delete();
    }

    public <T> T getUserMastersByFirstName(Class<T> responseType, String FirstName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByFirstName/{0}", new Object[]{FirstName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getCityMastersByCityName(Class<T> responseType, String CityName) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getCityMastersByCityName/{0}", new Object[]{CityName}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByFPhoneNo(Class<T> responseType, String FPhoneNo) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByFPhoneNo/{0}", new Object[]{FPhoneNo}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getRoomsOfHostelId(Class<T> responseType, String HostelId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getRoomsOfHostelId/{0}", new Object[]{HostelId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void removePaymentDetail(String PaymentDetailId, String PaymentId) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removePaymentDetailToPaymentMaster/{0}/{1}", new Object[]{PaymentDetailId, PaymentId})).request().put(null);
    }

    public <T> T findCityMasterById(Class<T> responseType, String CityId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findCityMasterById/{0}", new Object[]{CityId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByAddress(Class<T> responseType, String Address) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByAddress/{0}", new Object[]{Address}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getUserMastersByMOccupation(Class<T> responseType, String MOccupation) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserMastersByMOccupation/{0}", new Object[]{MOccupation}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
