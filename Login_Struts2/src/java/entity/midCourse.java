/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class midCourse {
    private String id;
     private String idTrainee;

    public midCourse(String id, String idTrainee) {
        this.id = id;
        this.idTrainee = idTrainee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdTrainee() {
        return idTrainee;
    }

    public void setIdTrainee(String idTrainee) {
        this.idTrainee = idTrainee;
    }

    
    public midCourse(){}
    
}
