/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import entity.Course;
import entity.midCourse;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class CourseAction extends ActionSupport {

    private String id;
    private String name;
    private String category;
    private String topic;
    private String trainer;

    private String start;
    private String end;
    private String location;
    private String description;
    private String trainee;

    public CourseAction(String id, String name, String category, String topic, String trainer, String start, String end, String location, String description, String trainee, Vector<Course> items) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.topic = topic;
        this.trainer = trainer;
        this.start = start;
        this.end = end;
        this.location = location;
        this.description = description;
        this.trainee = trainee;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrainee() {
        return trainee;
    }

    public void setTrainee(String trainee) {
        this.trainee = trainee;
    }

 

    public CourseAction() {
    }

    public String deleteAciton() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.deleteCourse(id)) {
            return "success";
        }
        return "failed";

    }

    public String editAction() throws Exception {
        DataProcess dt = new DataProcess();
        //xem hàm lấy từ database
        Course c = dt.getbyID(id);
        name = c.getName();//lại get từng cái ỏka
        category = c.getCategory();
        topic = c.getTopic();
        start = c.getStart();
        end = c.getEnd();
        return "success";

    }

    public String upDateAction() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.editCourse(id, name, category, topic, start, end)) {
            return "success";
        }

        return "failed";

    }

    public String addAction() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.addCourse(id, name, category, topic, trainer, start, end, location, description)) {
            return "success";
        }
        return "failed";

    }

    private Vector<Course> items;

    public Vector<Course> getItems() {
        DataProcess dt = new DataProcess();
        items = dt.getData();
        return items;
    }

    public void setItems(Vector<Course> items) {
        this.items = items;
    }

    public String viewAction() throws Exception {
        DataProcess dt = new DataProcess();
        items = dt.getData();
        return "success";
    }

    public String searchAction() throws Exception {
        DataProcess dt = new DataProcess();
        //xem hàm lấy từ database
        Course c = dt.searchCourse(id);
        name = c.getName();//lại get từng cái ỏka
        category = c.getCategory();
        topic = c.getTopic();
        trainer = c.getTrainer();
        start = c.getStart();
        end = c.getEnd();
        location = c.getLocation();
        description = c.getDescription();
        return "success";

    }


}
