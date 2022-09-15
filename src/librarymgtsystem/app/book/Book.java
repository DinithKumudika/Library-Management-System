/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymgtsystem.app.book;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import librarymgtsystem.database.DBConnection;
import static librarymgtsystem.ui.manageBooks.manageBooks.loadTable;

/**
 *
 * @author Dinith
 */
public class Book extends DBConnection{
    private int id;
    private String title;
    private int isbn;
    private String author;
    private String publisher;
    private String category;
    private int availability;
    //private LocalDateTime created_at;
    private Connection conn = DBConnection.connect();

    
    public Book(int id, String title, int isbn, String author, String publisher, String category, int availability) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.availability = availability;
    }
    
    public Book(String title, int isbn, String author, String publisher, String category, int availability) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.availability = availability;
    }

    public Book() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    private boolean checkBookExist(){
        
        boolean isExist = false;
        
        try{
            String sql = "SELECT * FROM `tbl_books` WHERE `Title` = ? and `Isbn` = ? and `Author` = ? and `Publisher` = ? and `Category` = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.title);
            pst.setInt(2, this.isbn);
            pst.setString(3, this.author); 
            pst.setString(4, this.publisher);
            pst.setString(5, this.category);
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
    public boolean isValidBook(){
        if(this.checkBookExist()){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void addBook(){
        try {

            String sql = "INSERT INTO `tbl_books`(`Title`, `ISBN`, `Author`, `Publisher`,`Category`,`Availability`,`created_at`) VALUES (?,?,?,?,?,?,CURRENT_TIMESTAMP)";

            //java.sql.Timestamp timestamp=new java.sql.Timestamp(date.getTime());
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.title);
            pst.setInt(2, this.isbn);
            pst.setString(3, this.author);
            pst.setString(4, this.publisher);
            pst.setString(5, this.category);
            pst.setInt(6, this.availability);
            

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

   
    public List<Book> viewAllBooks(){
        ArrayList<Book> book = new ArrayList<>();
        try {
	    		String sql = "select * from tbl_books";
                        PreparedStatement pst = this.conn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt("Id");
	    			String title = rs.getString("Title");
                                int isbn =rs.getInt("ISBN");
                                String author =rs.getString("Author");
                                String publisher =rs.getString("publisher");
                                String category = rs.getString("Category");
                                int availability = rs.getInt("availability");
                                
                                Timestamp created =rs.getTimestamp("created_at");
                                LocalDateTime localDateTime = created.toLocalDateTime();
	    			Book book1 = new Book(id, title, isbn, author, publisher, category, availability);
	    			book.add(book1);
	    		}
	    		
	    	}
	    	catch(Exception e) {
                        
	    		e.printStackTrace();
	    	}	
        return book;
        }
    
//    public Book viewdata(int id){
//        Book b = null;
//        
//        try{
//           String sql = "select * from tbl_books where id ="+id+"";
//                        PreparedStatement pst = this.conn.prepareStatement(sql);
//                        ResultSet rs = pst.executeQuery();
//	    		
//	    		while(rs.next()) {
//	    			int ids = rs.getInt("Id");
//	    			String title = rs.getString("Title");
//                                int isbn =rs.getInt("ISBN");
//                                String author =rs.getString("Author");
//                                String publisher =rs.getString("publisher");
//                                String category = rs.getString("Category");
//                                int availability = rs.getInt("availability");
//                                Timestamp created =rs.getTimestamp("created_at");
//                                LocalDateTime localDateTime = created.toLocalDateTime();
//                                
//	    			b = new Book(id, title, isbn, author, publisher, category, availability);
//	    			
//	    		}
//        }
//        catch(Exception e) {
//                        
//            e.printStackTrace();
//	}
//        return b;
//    }
    
    /*public void updateBook(int id, String title, int isbn, String author, String publisher, String category, int availability) {
    	
    	try {
    		String sql = "update tbl_books set Title='"+title+"', ISBN='"+isbn+"', Author='"+author+"', Publisher='"+publisher+"', Category='"+category+"', Availability='"+availability+"' where ID='"+id+"'";
                //Statement stmt = this.conn.Statement(sql);
    		Statement stmt = null;
                
    		stmt = conn.createStatement();
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			JOptionPane.showMessageDialog(null, "A book has been updated successfully");
                        loadTable();
    		}
    		else {
    			JOptionPane.showMessageDialog(null, "A book has not been updated successfully");
            }	
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }*/
  /*  public void updateBook(Book book) {
    	
    	try {
            String sql = "update tbl_books set Title='"+book.getTitle()+"', ISBN='"+book.getIsbn()+"', Author='"+book.getAuthor()+"', Publisher='"+book.getPublisher()+"', Category='"+book.getCategory()+"', Availability='"+book.getAvailability()+"' where ID='"+book.getId()+"'";
            //Statement stmt = this.conn.Statement(sql);
            Statement stmt = null;

            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(sql);

            if(rs > 0) {
                    JOptionPane.showMessageDialog(null, "A book has been updated successfully");
                    loadTable();
            }
            else {
                    JOptionPane.showMessageDialog(null, "A book has not been updated successfully");
            }	
    	}
    	catch(Exception e) {
            e.printStackTrace();
    	}
    	
    }
 */
    public void update(int id){
        try{
            String sql = "UPDATE `tbl_books` SET `Title` = ?, `ISBN` = ?, `Author` = ?, `Publisher` = ?, `Category` = ?, `Availability` = ? WHERE ID = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, this.title);
            pst.setInt(2, this.isbn);
            pst.setString(3, this.author);
            pst.setString(4, this.publisher);
            pst.setString(5, this.category);
            pst.setString(6, this.publisher);
            pst.setInt(5,this.availability);
            
            int resultRows = pst.executeUpdate();
            
            System.out.println(resultRows + " rows updated");
            
        }
        catch(SQLException e){
            e.getMessage();
        }
    }
    public void deleteBook(int id){
        try{
            String sql = "delete from `tbl_books` where ID = ?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            int r = pst.executeUpdate(sql);

            if (r > 0) {
                JOptionPane.showMessageDialog(null, "A book has been deleted successfully");
                loadTable();
            }
            else {
                JOptionPane.showMessageDialog(null, "A book has not been deleted successfully");
            }
         }
        catch(Exception e) {
            e.printStackTrace();
	}
    }
    
    private void issueBook(int bookId, int memberId, String issuedDate, String returnDate){
        try {
            String sql = "INSERT INTO `tbl_books_issued` (`issued_date`,`return_date`,`book_ID`,`member_ID`) VALUES (?,?,?,?)";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setDate(1, Date.valueOf(issuedDate));
            pst.setDate(2, Date.valueOf(returnDate));
            pst.setInt(3, bookId);
            pst.setInt(4, memberId);
            int rows = pst.executeUpdate();
            
            if(rows > 0){
                System.out.println("Book issued");
            }
            else{
                System.out.println("Book issue failed");
            }
            
            String sql2 = "UPDATE `tbl_books` SET `Availability` = 0 WHERE `ID` = ?";
            PreparedStatement pst2 = this.conn.prepareStatement(sql2);
            pst2.setInt(1, bookId);
            int rows2 = pst2.executeUpdate();
        } 
        catch (SQLException e) {
            e.getMessage();
        } 
    }
    
    public void setIssueBookDetails(int bookId, int memberId, String issuedDate, String returnDate){
        this.issueBook(bookId, memberId, issuedDate, returnDate);
    }
    
    private void returnBook(int bookId, int memberId, String returnedDate){
        try {
            String sql = "INSERT INTO `tbl_books_returned` (`book_ID`,`member_ID`,`returned_date`) VALUES (?,?,?)";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.setInt(2, memberId);
            pst.setDate(3, java.sql.Date.valueOf(returnedDate));
        } 
        catch (SQLException e) {
            e.getMessage();
        } 
    }
    
    
    public void setReturnBookDetails(int bookId, int memberId, String returnedDate){
        this.returnBook(bookId, memberId, returnedDate);
    }
}
