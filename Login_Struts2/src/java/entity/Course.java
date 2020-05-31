/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Course {

    private String id;
    private String name;
    private String category;
    private String topic;
    private String trainer;

    private String start;
    private String end;
    private String location;
    private String description;
    
 

    public Course() {
    }

    public Course(String id, String name, String category, String topic, String trainer, String start, String end, String location, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.topic = topic;
        this.trainer = trainer;
        this.start = start;
        this.end = end;
        this.location = location;
        this.description = description;
        
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

   
    

  

    
}
