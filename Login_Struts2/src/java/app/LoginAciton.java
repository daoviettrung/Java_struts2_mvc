/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class LoginAciton extends ActionSupport {
    private String user;
    private String pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }
    
    public LoginAciton() {
    }
    
    public String execute() throws Exception {
        DataProcess dt= new DataProcess();
     if(dt.checkLogin(user,pass))
           return "success";
       return "failed";
    }
    
}
