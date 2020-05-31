/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import entity.Course;
import java.util.Vector;
import static jdk.nashorn.internal.runtime.Debug.id;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class editAction extends ActionSupport {

    private String id;
    private String name;
    private String category;
    private String topic;
    private String start;
    private String end;

    public editAction(String id, String name, String category, String topic, String start, String end) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.topic = topic;
        this.start = start;
        this.end = end;
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

    public editAction() {
    }

    public String execute() throws Exception {
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

}
