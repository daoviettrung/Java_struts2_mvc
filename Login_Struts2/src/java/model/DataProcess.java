/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Category;
import entity.Course;
import entity.midCourse;
import entity.midTopic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DataProcess {

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Demo_AP";
            String user = "sa";
            String pass = "123456";
            try {
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean checkLogin(String u, String p) {

        boolean flag = false;
        String sql = "select * from tblAccount where _user =? and _pass=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, u);
            prst.setString(2, p);
            ResultSet rs = prst.executeQuery();
            flag = rs.next();
            rs.close();
            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flag;

    }

    public Vector<Course> getData() {
        Vector<Course> list = new Vector<Course>();
        String sql = "select * from tblManageCourse";
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            // Connection conn=getConnection();

            while (rs.next()) {
                Course c = new Course((rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                list.add(c);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean addCourse(String id, String name, String category, String topic, String trainer, String start, String end, String location, String description) {
        int result = 0;
        String sql = "insert into tblManageCourse values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, id);
            prst.setString(2, name);
            prst.setString(3, category);
            prst.setString(4, topic);
            prst.setString(5, trainer);
            prst.setString(6, start);
            prst.setString(7, end);
            prst.setString(8, location);
            prst.setString(9, description);

            result = prst.executeUpdate();

            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public boolean deleteCourse(String id) {
        int result = 0;
        String sql = "delete tblManageCourse where _id=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, id);

            result = prst.executeUpdate();

            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public boolean editCourse(String id, String name, String category, String topic, String start, String end) {
        String sql = "update tblManageCourse set _name=?, _category=?,_topic=?,_start=?,_end=? where _id=?";
        int result = 0;
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();

            prst.setString(1, name);
            prst.setString(2, category);
            prst.setString(3, topic);
            prst.setString(4, start);
            prst.setString(5, end);
            prst.setString(6, id);
            result = prst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;

    }
//chỉ nên return ra course thôi lấy cả vecter làm gì Bạn sửa luôn giúp mình

    public Course getbyID(String id) {
        Course c = new Course();
        String sql = "select * from tblManageCourse where _id=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, id);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setCategory(rs.getString(3));
                c.setTopic(rs.getString(4));
                c.setStart(rs.getString(5));
                c.setEnd(rs.getString(6));
            }
            prst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public Vector<Category> getDataC() {
        Vector<Category> list = new Vector<Category>();
        String sql = "select * from tblCategory";
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);//ô chưa tạo con
            // Connection conn=getConnection();

            while (rs.next()) {
                Category c = new Category((rs.getString(1)), rs.getString(2), rs.getString(3));
                list.add(c);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean addCate(String id, String name, String des) {
        int result = 0;
        String sql = "insert into tblCategory values(?,?,?)";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, id);
            prst.setString(2, name);
            prst.setString(3, des);

            result = prst.executeUpdate();

            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public boolean deleteCate(String id) {
        int result = 0;
        String sql = "delete tblCategory where _id=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, id);

            result = prst.executeUpdate();

            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public boolean editCate(String id, String name, String des) {
        String sql = "update tblCategory set _name=?, _description=? where _id=?";
        int result = 0;
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();

            prst.setString(1, name);
            prst.setString(2, des);
            prst.setString(3, id);
            result = prst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;

    }
//chỉ nên return ra course thôi lấy cả vecter làm gì Bạn sửa luôn giúp mình

    public Category getbyIDC(String id) {
        Category c = new Category();
        String sql = "select * from tblCategory where _id=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, id);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setDes(rs.getString(3));

            }
            prst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public Course searchCourse(String id) {
        Course c = new Course();
        String sql = "select * from tblManageCourse where _id=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, id);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setCategory(rs.getString(3));
                c.setTopic(rs.getString(4));
                c.setTrainer(rs.getString(5));
                c.setStart(rs.getString(6));
                c.setEnd(rs.getString(7));
                c.setLocation(rs.getString(8));
                c.setDescription(rs.getString(9));

            }
            prst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public boolean addMidCourse(String idCourse, String idTrainee) {
        int result = 0;
        String sql = "insert into tblmidCourse values(?,?)";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, idCourse);
            prst.setString(2, idTrainee);

            result = prst.executeUpdate();

            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public Vector<midTopic> searchMidTopic(String id) {
        Vector<midTopic> list = new Vector<midTopic>();
        String sql = "select * from tblmidTopic where _topicid=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, id);
            ResultSet rs = prst.executeQuery();
            // Connection conn=getConnection();

            while (rs.next()) {
                midTopic c = new midTopic((rs.getString(1)), rs.getString(2));
                list.add(c);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean addMidTopic(String topicid, String trainerid) {
        int result = 0;
        String sql = "insert into tblmidTopic values(?,?)";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, topicid);
            prst.setString(2, trainerid);

            result = prst.executeUpdate();

            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public Vector<midCourse> searchMidCourse(String id) {
        Vector<midCourse> list = new Vector<midCourse>();
        String sql = "select * from tblmidCourse where _idCourse=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, id);
            ResultSet rs = prst.executeQuery();
            // Connection conn=getConnection();

            while (rs.next()) {
                midCourse c = new midCourse((rs.getString(1)), rs.getString(2));
                list.add(c);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Vector<midCourse> getDataMidCourse() {
        Vector<midCourse> list = new Vector<midCourse>();
        String sql = "select * from tblmidCourse";
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            // Connection conn=getConnection();

            while (rs.next()) {
                midCourse c = new midCourse((rs.getString(1)), rs.getString(2));
                list.add(c);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Vector<midTopic> getDataMidTopic() {
        Vector<midTopic> list = new Vector<midTopic>();
        String sql = "select * from tblmidTopic";
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            // Connection conn=getConnection();

            while (rs.next()) {
                midTopic c = new midTopic((rs.getString(1)), rs.getString(2));
                list.add(c);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

   

}
