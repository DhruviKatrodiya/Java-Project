/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Bean;

import Entity.Feedback;
import ejb.UserBeanLocal;
import java.util.Collection;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author meetk
 */
@Named(value = "User")
@RequestScoped
public class User {
    
    //Feedback
    private int feedback_id;
    private String comments;
    private Collection<Feedback> feedback;
    
    
    @EJB UserBeanLocal ubl;

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Collection<Feedback> getFeedback() {
        return ubl.getAllFeedback();
    }

    public void setFeedback(Collection<Feedback> feedback) {
        this.feedback = feedback;
    }

    public UserBeanLocal getUbl() {
        return ubl;
    }

    public void setUbl(UserBeanLocal ubl) {
        this.ubl = ubl;
    }
    
    

    /**
     * Creates a new instance of User
     */
    public User() {
    }
    
    public String addFeedback(){
        try{
            
                ubl.addFeedback(comments);
                comments= null;
                System.out.println("Data Inserted !!!");
           
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
    
    
    
    
}
