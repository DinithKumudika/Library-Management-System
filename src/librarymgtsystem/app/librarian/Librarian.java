/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymgtsystem.app.librarian;

/**
 *
 * @author Dinith
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import librarymgtsystem.database.DBConnection;
import librarymgtsystem.ui.manageLibrarians.manageLibrarians;

/**
 *
 * @author Dinith
 */
public class Librarian extends DBConnection{
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
                        manageLibrarians.loadTable();
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
	    		String sql = "select * from `tbl_librarian`";
                        PreparedStatement pst = this.conn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt("ID");
	    			String firstName = rs.getString("First name");            
                                String lastName =rs.getString("Last name");
                                String username =rs.getString("username");
                                String password = rs.getString("password");
                                
	    			Librarian librarian1 = new Librarian(id, firstName, lastName, username, password);
	    			librarian.add(librarian1);
	    		}
	    		
	    	}
	    	catch(Exception e) {
                        
	    		e.printStackTrace();
	    	}	
        return librarian;
        }
 public void update(int id){
        try{
            String sql = "UPDATE `tbl_librarian` SET `First name` = ?, `Last name` = ?, `username` = ?, `password` = ? WHERE ID = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.firstName);
            pst.setString(2, this.lastName);
            pst.setString(3, this.username);
            pst.setString(4, this.password);
            pst.setInt(5, this.id);
            
            int resultRows = pst.executeUpdate();
            
            if (resultRows > 0) {
                System.out.println("Book updated");
                manageLibrarians.loadTable();
            }
            else{
                System.out.println("Book update failed");
            }  
        }
        catch(SQLException e){
            e.getMessage();
        }
    }
 
  public void deleteLibrarian(int id){
        try{
            String sql = "delete from tbl_librarian where ID ="+id+"";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            int r = pst.executeUpdate(sql);

            if (r > 0) {
                JOptionPane.showMessageDialog(null, "A librarian has been deleted successfully");
                manageLibrarians.loadTable();
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
