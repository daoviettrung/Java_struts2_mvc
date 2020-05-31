/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import entity.Category;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class CateAction extends ActionSupport {
    private String id;
    private String name;
    private String des;

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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    public CateAction() {
    }

    public CateAction(String id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }
    
   public String deleteAcitonC() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.deleteCate(id)) {
            return "success";
        }
        return "failed";

    }

    public String editActionC() throws Exception {
        DataProcess dt = new DataProcess();
        //xem hàm lấy từ database
       Category c = dt.getbyIDC(id);
        setId(c.getId());
        name = c.getName();//lại get từng cái ỏka
        des = c.getDes();
        return "success";

    }

    public String upDateActionC() throws Exception {
        DataProcess dt = new DataProcess();
        if (dt.editCate(id, name, des)) {
            return "success";
        }

        return "failed";

    }

    public String addActionC() throws Exception {//ĐƯngf xóa :V t chưa coppy hết vào :v oke // đun
        DataProcess dt = new DataProcess();
        if (dt.addCate(id, name, des)) {
            return "success";
        }
        return "failed";

    }

    
    
    private Vector<Category> itemts;
    
    public Vector<Category> getItemts()
    {
        DataProcess dt =new DataProcess();
        itemts = dt.getDataC();
        return itemts;
    }
    public  void  setItemts(Vector<Category> itemts){
        this.itemts= itemts;
    }

    public String viewActionC() throws Exception{
         DataProcess dt =new DataProcess();
        itemts = dt.getDataC();
        return "success";
    }
    
}
