/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymgtsystem.ui.manageMembers;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import librarymgtsystem.app.member.Member;
import librarymgtsystem.database.DBConnection;
import librarymgtsystem.ui.addMember.AddMember;
import librarymgtsystem.ui.home.Librarian.homeLibrarian;
import librarymgtsystem.ui.login.loginForm;
import librarymgtsystem.ui.updateMember.updateMember;
/**
 *
 * @author Dinith
 */
public class manageMembers extends javax.swing.JFrame {
    private Connection conn;

    /**
     * Creates new form manageMembers
     */
    public manageMembers() {
        initComponents();
        this.retrieveMembers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUser = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMembers = new javax.swing.JTable();
        btnDeleteMember = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();
        btnUpdateMember = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        sideBar = new javax.swing.JPanel();
        btnAddBook1 = new javax.swing.JButton();
        btnIssueBook1 = new javax.swing.JButton();
        btnReturnBook1 = new javax.swing.JButton();
        btnDashboard1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUser.setBackground(new java.awt.Color(102, 102, 102));
        pnlUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Address", "Phone No"
            }
        ));
        tblMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMembersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMembers);

        pnlUser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 30, 710, 530));

        btnDeleteMember.setBackground(new java.awt.Color(153, 102, 0));
        btnDeleteMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/delete.png"))); // NOI18N
        btnDeleteMember.setText("Detele Member");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });
        pnlUser.add(btnDeleteMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 50));

        btnAddMember.setBackground(new java.awt.Color(153, 102, 0));
        btnAddMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/plus.png"))); // NOI18N
        btnAddMember.setText("Add Member");
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });
        pnlUser.add(btnAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, 50));

        btnUpdateMember.setBackground(new java.awt.Color(153, 102, 0));
        btnUpdateMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/refresh.png"))); // NOI18N
        btnUpdateMember.setText("Update Member");
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMemberActionPerformed(evt);
            }
        });
        pnlUser.add(btnUpdateMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, 50));

        getContentPane().add(pnlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 980, 680));

        btnLogout.setBackground(new java.awt.Color(0, 204, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/log-out.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 150, 50));

        sideBar.setBackground(new java.awt.Color(153, 153, 153));
        sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddBook1.setBackground(new java.awt.Color(153, 102, 0));
        btnAddBook1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/book (1).png"))); // NOI18N
        btnAddBook1.setText("Manage Books");
        btnAddBook1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddBook1.setMaximumSize(new java.awt.Dimension(181, 66));
        btnAddBook1.setMinimumSize(new java.awt.Dimension(181, 66));
        btnAddBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBook1ActionPerformed(evt);
            }
        });
        sideBar.add(btnAddBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 90));

        btnIssueBook1.setBackground(new java.awt.Color(153, 102, 0));
        btnIssueBook1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIssueBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/book (2).png"))); // NOI18N
        btnIssueBook1.setText("Book Issue");
        btnIssueBook1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnIssueBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBook1ActionPerformed(evt);
            }
        });
        sideBar.add(btnIssueBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 90));

        btnReturnBook1.setBackground(new java.awt.Color(153, 102, 0));
        btnReturnBook1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReturnBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/return.png"))); // NOI18N
        btnReturnBook1.setText("Book Return");
        btnReturnBook1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBook1ActionPerformed(evt);
            }
        });
        sideBar.add(btnReturnBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 230, 90));

        btnDashboard1.setBackground(new java.awt.Color(153, 102, 0));
        btnDashboard1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDashboard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/dashboard.png"))); // NOI18N
        btnDashboard1.setText("Dashboard");
        btnDashboard1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard1ActionPerformed(evt);
            }
        });
        sideBar.add(btnDashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 230, 90));

        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/undo.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        sideBar.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 80));

        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 780));

        bgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/home_bg.jpg"))); // NOI18N
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retrieveMembers(){
        try {
            this.conn = DBConnection.connect();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM tbl_member";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int index = 0;
                
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                String phoneNo = rs.getString("phone no");
                
                Object[] row = {id, name, age, address, phoneNo};
                
                DefaultTableModel model = (DefaultTableModel) this.tblMembers.getModel();
                
                model.addRow(row);    
            }
 
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame login = new loginForm();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBook1ActionPerformed

    private void btnIssueBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIssueBook1ActionPerformed

    private void btnReturnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReturnBook1ActionPerformed

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1ActionPerformed

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.tblMembers.getSelectedRow();
        int id = Integer.parseInt(this.tblMembers.getValueAt(selectedRow, 0).toString());
        Member member = new Member();
        member.deleteMember(id);
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        // TODO add your handling code here:
        JFrame addMember = new AddMember();
        addMember.setVisible(true);
        addMember.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed
        // TODO add your handling code here:
        int  selectedRow = this.tblMembers.getSelectedRow();
        int id = Integer.parseInt(this.tblMembers.getValueAt(selectedRow, 0).toString());
        String name = this.tblMembers.getValueAt(selectedRow, 1).toString();
        String age = this.tblMembers.getValueAt(selectedRow, 2).toString();
        String address = this.tblMembers.getValueAt(selectedRow, 3).toString();
        String phone = this.tblMembers.getValueAt(selectedRow, 4).toString();
        
        JFrame updateMemberFrame = new updateMember();
        
        //set name value got from table row to name textfield in UpdateMember frame
        JTextField nameField = updateMember.tfName;
        nameField.setText(name);
        
        //set age Value got from table row to age textfield in UpdateMember frame
        JTextField ageField = updateMember.tfAge;
        ageField.setText(age);
        
        //set address Value got from table row to age textfield in UpdateMember frame
        JTextField addressField = updateMember.tfAddress;
        addressField.setText(address);
        
        //set phone no Value got from table row to age textfield in UpdateMember frame
        JTextField phoneField = updateMember.tfPhone;
        phoneField.setText(phone);
        
        updateMemberFrame.setVisible(true);
        updateMemberFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame home = new homeLibrarian();
        home.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMembersMouseClicked
        // TODO add your handling code here:   
    }//GEN-LAST:event_tblMembersMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImg;
    private javax.swing.JButton btnAddBook1;
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnIssueBook1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReturnBook1;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTable tblMembers;
    // End of variables declaration//GEN-END:variables
}
