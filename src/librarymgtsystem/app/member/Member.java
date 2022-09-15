/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymgtsystem.app.member;

import java.sql.*;
import java.util.*;
import javax.swing.text.html.parser.TagElement;
import librarymgtsystem.database.DBConnection;

/**
 *
 * @author Dinith
 */
public class Member extends DBConnection{
    private String name;
    private int age;
    private String address;
    private String phoneNo;
    private int librarianID;
    private Connection conn = DBConnection.connect();
    
    public Member (String name, int age, String address, String phoneNo){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    
    public Member(){};
    
    private boolean checkMemberExist(){
        
        boolean isExist = false;
        
        try{
            String sql = "SELECT * FROM `tbl_member` WHERE `name` = ? and `age` = ? and `address` = ? and `phone no` = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.name);
            pst.setInt(2, this.age);
            pst.setString(3, this.address); 
            pst.setString(4, this.phoneNo);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                isExist = true;
            }
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return isExist;
    }
    
    public boolean isValidMember(){
        if(this.checkMemberExist()){
            return false;
        }
        else{
            return true;
        }
    }
    
    private void create(){
        try {
            String sql = "INSERT INTO `tbl_member`(`name`, `age`, `address`, `phone no`) VALUES (?,?,?,?)";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.name);
            pst.setInt(2, this.age);
            pst.setString(3, this.address);
            pst.setString(4, this.phoneNo);
            
            int resultRows = pst.executeUpdate();
            
            if(resultRows > 0){
                System.out.println("Member created");
            }
            else{
                System.out.println("Member creation failed");
            }
            
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void remove(int id){
        try {
            String sql = "DELETE FROM `tbl_member` WHERE `id` = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            int resultRows = pst.executeUpdate();
            if (resultRows>0) {
                System.out.println("Member deleted");
            }
            else{
                System.out.println("Member deletion failed");
            }
            
        } 
        catch (SQLException e) {
            e.getMessage();
        }
    }
    
    private void update(int id, String name, int age, String address,String phoneNo){
        try{
            String sql = "UPDATE `tbl_member` SET `name` = ?, `age` = ?, `address` = ?, `phone no` = ? WHERE ID = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setString(3, address);
            pst.setString(4, phoneNo);
            pst.setInt(5, id);
         
            int resultRows = pst.executeUpdate();
            
            if(resultRows>0){
                System.out.println("Member updated");
            }
            else{
                System.out.println("Member update failed");
            }
            
            
        }
        catch(SQLException e){
            e.getMessage();
        }
    }
    
    public void addMember(){
        this.create();
    }
    
    public void deleteMember(int id){
        this.remove(id);
    }
    
    public void updateMember(int id, String name, int age, String address,String phoneNo){
        this.update(id, name, age, address,phoneNo);
    }
}
