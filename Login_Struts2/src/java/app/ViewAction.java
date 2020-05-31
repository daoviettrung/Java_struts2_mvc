/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import com.opensymphony.xwork2.ActionSupport;
import entity.Course;

import java.util.Vector;
import model.DataProcess;
/**
 *
 * @author ADMIN
 */
public class ViewAction extends ActionSupport{
    private Vector<Course> items;
    
    public Vector<Course> getItems()
    {
        DataProcess dt =new DataProcess();
        items = dt.getData();
        return items;
    }
    public  void  setItems(Vector<Course> items){
        this.items= items;
    }
    public ViewAction(){}
    public String execute() throws Exception{
         DataProcess dt =new DataProcess();
        items = dt.getData();
        return "success";
    }
    
    
}
