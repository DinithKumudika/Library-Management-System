/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymgtsystem.app.admin;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import librarymgtsystem.database.DBConnection;
/**
 *
 * @author Dinith
 */
public class Admin extends DBConnection {
    private int librarianID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Connection conn = DBConnection.connect();

public Admin (String firstName, String lastName, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.username = password;
    }
/*
private boolean checkLibrarianExist(){
        
        boolean isExist = false;
        
        try{
            String sql = "SELECT * FROM `tbl_librarian` WHERE `First name` = ? and `Last name` = ? and `username` = ? `password` = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.firstName);
            pst.setString(2, this.lastName);
            pst.setString(3, this.username);
            pst.setString(4, this.password);
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

    public boolean isValidLibrarian(){
        if(this.checkLibrarianExist()){
            return false;
        }
        else{
            return true;
        }
    }
    
     public void addLibrarian(){
        try {
            String sql = "INSERT INTO `tbl_librarian`(`First name`, `Last name`, `username`, `password`) VALUES (?,?,?,?)";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.firstName);
            pst.setString(2, this.lastName);
            pst.setString(3, this.username);
            pst.setString(4, this.password);
            
            int resultRows = pst.executeUpdate();
            System.out.println(resultRows + " rows inserted");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
*/

}