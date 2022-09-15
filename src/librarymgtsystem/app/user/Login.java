package librarymgtsystem.app.user;

import librarymgtsystem.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends DBConnection{
    private String username;
    private String password;
    private String userType;
    private int id;
    private boolean isValid;

    private Connection conn = DBConnection.connect();
    
    public Login(String username, String password, String userType){
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public boolean getValidStatus(){
        if(this.validateUserCredentials()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getLibrarianID(){
        return this.id;
    }

    private boolean validateUserCredentials(){
        this.isValid = false;
        try{
            if(this.userType.equals("Admin")){
                String sql = "SELECT * FROM tbl_admin WHERE username = ? and password = ?";
                PreparedStatement pst = this.conn.prepareStatement(sql);
                pst.setString(1, this.username);
                pst.setString(2, this.password);
                ResultSet rs = pst.executeQuery();
                
                while(rs.next()){
                    this.isValid = true;
                    System.out.println("Login as Admin!");
                }
            }
            else{
                String sql = "SELECT * FROM tbl_librarian WHERE username = ? and password = ?";
                PreparedStatement pst = this.conn.prepareStatement(sql);
                pst.setString(1, this.username);
                pst.setString(2, this.password);
                ResultSet rs = pst.executeQuery();

                while(rs.next()){
                    this.isValid = true;
                    int librarianID = rs.getInt("ID");
                    //set librarian id
                    this.id = librarianID;
                    
                    System.out.println("Login as Librarian!");
                }
            } 
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return this.isValid;
    }
}
