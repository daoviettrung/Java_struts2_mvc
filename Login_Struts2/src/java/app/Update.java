/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class Update extends ActionSupport {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String name;
    private String category;
    private String topic;
    private String start;
    private String end;

    public Update(String id, String name, String category, String topic, String start, String end) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.topic = topic;
        this.start = start;
        this.end = end;
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

    public Update() {
    }

    public String execute() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.editCourse(id, name, category, topic, start, end)) {
            return "success";
        }

        return "failed";

    }

}
