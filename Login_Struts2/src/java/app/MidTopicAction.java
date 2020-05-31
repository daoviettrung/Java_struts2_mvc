/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import entity.midTopic;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class MidTopicAction extends ActionSupport {

    private String topicid;
    private String trainerid;

    public MidTopicAction(String topicid, String trainerid) {
        this.topicid = topicid;
        this.trainerid = trainerid;
    }

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid;
    }

    public String getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(String trainerid) {
        this.trainerid = trainerid;
    }

    public MidTopicAction() {
    }

    private Vector<midTopic> midTopic;

    public Vector<midTopic> getMidTopic() {
        DataProcess dt = new DataProcess();
        midTopic = dt.getDataMidTopic();
        return midTopic;
    }

    public void setMidTopic(Vector<midTopic> midTopic) {
        this.midTopic = midTopic;
    }

    public String viewMidTopicAction() throws Exception {
//        DataProcess dt = new DataProcess();
//        midTopic = dt.getDataMidTopic();
        return "success";
    }

    public String addMidTopic() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.addMidTopic(topicid, trainerid)) {
            return "success";
        }
        return "failed";

    }

    private Vector<midTopic> SearchMidTopic;

    public Vector<midTopic> getSearchMidTopic() {
        DataProcess dt = new DataProcess();
        SearchMidTopic = dt.searchMidTopic(topicid);
        return SearchMidTopic;
    }

    public void setSearchMidTopic(Vector<midTopic> SearchMidTopic) {
        this.SearchMidTopic = SearchMidTopic;
    }

    public String viewSearchMidTopicAction() throws Exception {
        DataProcess dt = new DataProcess();
        SearchMidTopic = dt.searchMidTopic(topicid);
        return "success";
    }

}
