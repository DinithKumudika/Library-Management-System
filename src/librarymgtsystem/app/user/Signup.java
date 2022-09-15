package librarymgtsystem.app.user;

import librarymgtsystem.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Signup extends DBConnection {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Connection conn = DBConnection.connect();

    public Signup(String firstName, String lastName, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    private boolean checkUserExists(){
        boolean isExist = false;

        try {
            String sql = "SELECT * FROM tbl_librarian WHERE username = ? and password = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.username);
            pst.setString(2, this.password);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                isExist = true;
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }

        return isExist;
    }
    public boolean isValidUser(){
        if(this.checkUserExists()) {
            return false;
        }
        else {
            return true;
        }
    }

    public void allowRegistration(){
        this.registerUser();
    }

    private void registerUser(){
        try {
            String sql = "INSERT INTO `tbl_librarian`(`First name`, `Last name`, `username`, `password`) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.firstName);
            pst.setString(2, this.lastName);
            pst.setString(3, this.username);
            pst.setString(4, this.password);
            int resultRows = pst.executeUpdate();
            System.out.println(resultRows + " rows inserted");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
