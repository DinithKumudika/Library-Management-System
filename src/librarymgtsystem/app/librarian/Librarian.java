/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymgtsystem.app.librarian;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import librarymgtsystem.app.book.Book;
import librarymgtsystem.database.DBConnection;
import static librarymgtsystem.ui.manageBooks.manageBooks.loadTable;
/**
 *
 * @author Omicron
 */
public class Librarian extends DBConnection {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Connection conn = DBConnection.connect();

public Librarian (int id, String firstName, String lastName, String username, String password){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.username = password;
    }

public Librarian(){};

  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String author) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    

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
            
            int rs = pst.executeUpdate();
            if(rs > 0) {
    			System.out.println(rs + " rows inserted");
    		}
    		else {
    			System.out.println("Insertion unsuccessful");
    		}
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

 public List<Librarian> viewAllLibrarians(){
        ArrayList<Librarian> librarian = new ArrayList<>();
        try {
	    		String sql = "select * from tbl_librarian";
                        PreparedStatement pst = this.conn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt("Id");
	    			String firstName = rs.getString("firstName");            
                                String lastName =rs.getString("lastName");
                                String username =rs.getString("username");
                                String password = rs.getString("password");
                            
                                Timestamp created =rs.getTimestamp("created_at");
                                LocalDateTime localDateTime = created.toLocalDateTime();
	    			Librarian librarian1 = new Librarian(id, firstName, lastName, username, password);
	    			librarian.add(librarian1);
	    		}
	    		
	    	}
	    	catch(Exception e) {
                        
	    		e.printStackTrace();
	    	}	
        return librarian;
        }
    
 public Librarian viewdata(int id){
        Librarian n = null;
        
        try{
           String sql = "select * from tbl_librarian where id ="+id+"";
                        PreparedStatement pst = this.conn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
	    		
	    		while(rs.next()) {
	    			int ids = rs.getInt("Id");
	    			String firstName = rs.getString("firstName");            
                                String lastName =rs.getString("lastName");
                                String username =rs.getString("username");
                                String password = rs.getString("password");
                    
                                Timestamp created =rs.getTimestamp("created_at");
                                LocalDateTime localDateTime = created.toLocalDateTime();
                                
	    			n = new Librarian(id, firstName, lastName, username, password);
	    			
	    		}
        }
        catch(Exception e) {
                        
	    		e.printStackTrace();
	    	}
        return n;
}
 
  public void deleteLibrarian(int id){
        try{
            String sql = "delete from tbl_librarian where ID ="+id+"";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            int r = pst.executeUpdate(sql);

            if (r > 0) {
                JOptionPane.showMessageDialog(null, "A librarian has been deleted successfully");
                loadTable();
            }
            else {
                JOptionPane.showMessageDialog(null, "A librarian has not been deleted successfully");
            }
         }
        catch(Exception e) {
            e.printStackTrace();
	}
    }
 
}
