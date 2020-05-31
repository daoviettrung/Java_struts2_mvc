/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Course;
import entity.midCourse;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class MidCourseAction {
        private String id;
     private String idTrainee;

    public MidCourseAction(String id, String idTrainee, Vector<midCourse> midCourse) {
        this.id = id;
        this.idTrainee = idTrainee;
        this.midCourse = midCourse;
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

    public Vector<midCourse> getMidCourse() {
        return midCourse;
    }

    public void setMidCourse(Vector<midCourse> midCourse) {
        this.midCourse = midCourse;
    }

 
     
    public MidCourseAction(){}
       private Vector<midCourse> midCourse;

    public Vector<midCourse> getmidCourse() {
        DataProcess dt = new DataProcess();
        midCourse = dt.getDataMidCourse();
        return midCourse;
    }

    public void setmidCourse(Vector<midCourse> midCourse) {
        this.midCourse = midCourse;
    }

    public String viewMidCourseAction() throws Exception {
        DataProcess dt = new DataProcess();
        midCourse = dt.getDataMidCourse();
        return "success";
    }
    
    public String addMidCourse() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.addMidCourse(id, idTrainee)) {
            return "success";
        }
        return "failed";

    }
    
       private Vector<midCourse> SearchMidCourse;

    public Vector<midCourse> getSearchMidCourse() {
        DataProcess dt = new DataProcess();
        SearchMidCourse = dt.searchMidCourse(id);
        return SearchMidCourse;
    }

    public void setSearchMidCourse(Vector<midCourse> SearchMidCourse) {
        this.SearchMidCourse = SearchMidCourse;
    }

    public String viewSearchMidCourseAction() throws Exception {
        DataProcess dt = new DataProcess();
        SearchMidCourse =dt.searchMidCourse(id);
        return "success";
    }
   
    
}
