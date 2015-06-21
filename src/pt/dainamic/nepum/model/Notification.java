/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.dainamic.nepum.model;

/**
 *
 * @author Utilizador
 */
public class Notification {
    
    private int idNotification;
    private int idAppointment;
    private int idSession;
    private int idComment;
   
    private String description;
    private byte isPatientN;
    private int idPatient;
    private int idHealthProfessional;


    public Notification(int idNotification, int idAppointment, int idSession, int idComment, byte saw, String description, byte isPatientN, int idPatient, int idHealthProfessional) {
        this.idNotification = idNotification;
        this.idAppointment = idAppointment;
        this.idSession = idSession;
        this.idComment = idComment;
        
        this.description = description;
        this.isPatientN = isPatientN;
        this.idPatient = idPatient;
        this.idHealthProfessional = idHealthProfessional;
        
    }

    






    public int getIdComment() {
        return idComment;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public int getIdSession() {
        return idSession;
    }



    public String getDescription() {
        return description;
    }

    public byte getIsPatientN() {
        return isPatientN;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public int getIdHealthProfessional() {
        return idHealthProfessional;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsPatientN(byte isPatientN) {
        this.isPatientN = isPatientN;
    }
    

   
    
    
}
