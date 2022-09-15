/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymgtsystem.app.member;

import java.sql.*;
import java.util.*;
import librarymgtsystem.database.DBConnection;
import librarymgtsystem.ui.manageMembers.manageMembers;

/**
 *
 * @author Dinith
 */
public class Member extends DBConnection{
    private int id;
    private String name;
    private int age;
    private String address;
    private String phoneNo;
    private Connection conn = DBConnection.connect();
    
    public Member (String name, int age, String address, String phoneNo){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    
    public Member (int id,String name, int age, String address, String phoneNo){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    
    public Member(){};
    
    public int getId(){
       return  this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return  this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setPhoneNo(String phoneNo){
       this.phoneNo = phoneNo;
    }
    
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    
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
    
        public List<Member> viewAllMembers(){
            ArrayList<Member> member = new ArrayList<>();
            try {
	    		String sql = "select * from `tbl_member`";
                        PreparedStatement pst = this.conn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt("Id");
	    			String name = rs.getString("name");
                                int age =rs.getInt("age");
                                String address =rs.getString("address");
                                String phoneNo =rs.getString("phone no");
                                
	    			Member member1 = new Member(id, name, age, address, phoneNo);
	    			member.add(member1);
	    		}
	    		
	    	}
	    	catch(Exception e) {
                        
	    		e.printStackTrace();
	    	}	
            return member;
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
                manageMembers.loadTable();
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
                manageMembers.loadTable();
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
                manageMembers.loadTable();
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
