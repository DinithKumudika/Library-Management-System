/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymgtsystem.ui.returnBook;

import librarymgtsystem.app.book.Book;

/**
 *
 * @author Dinith
 */
public class returnBook extends javax.swing.JFrame {

    /**
     * Creates new form returnBook
     */
    public returnBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formAddMember = new javax.swing.JPanel();
        lblPhone = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        tfBookId = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        tfMemberId = new javax.swing.JTextField();
        formHeader = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbReturnYear = new javax.swing.JComboBox<>();
        cmbReturnDate = new javax.swing.JComboBox<>();
        cmbReturnMonth = new javax.swing.JComboBox<>();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formAddMember.setBackground(new java.awt.Color(204, 204, 204));
        formAddMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(153, 102, 0));
        lblPhone.setText("Return Date :");
        formAddMember.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 102, 0));
        lblName.setText("Book ID :");
        formAddMember.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        btnClear.setBackground(new java.awt.Color(255, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        formAddMember.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 130, 40));

        btnReturn.setBackground(new java.awt.Color(0, 204, 0));
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(0, 0, 0));
        btnReturn.setText("Return Book");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        formAddMember.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 170, 40));

        tfBookId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfBookId.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookIdActionPerformed(evt);
            }
        });
        formAddMember.add(tfBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 280, 40));

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(153, 102, 0));
        lblAge.setText("Member ID :");
        formAddMember.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        tfMemberId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfMemberId.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddMember.add(tfMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 280, 40));

        formHeader.setBackground(new java.awt.Color(153, 102, 0));

        jLabel5.setBackground(new java.awt.Color(153, 102, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Return a Book");

        javax.swing.GroupLayout formHeaderLayout = new javax.swing.GroupLayout(formHeader);
        formHeader.setLayout(formHeaderLayout);
        formHeaderLayout.setHorizontalGroup(
            formHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        formHeaderLayout.setVerticalGroup(
            formHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        formAddMember.add(formHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        cmbReturnYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023" }));
        cmbReturnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReturnYearActionPerformed(evt);
            }
        });
        formAddMember.add(cmbReturnYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 80, 40));

        cmbReturnDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbReturnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReturnDateActionPerformed(evt);
            }
        });
        formAddMember.add(cmbReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 80, 40));

        cmbReturnMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        formAddMember.add(cmbReturnMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 80, 40));

        getContentPane().add(formAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 570, 720));

        bgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/home_bg.jpg"))); // NOI18N
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        int bookId = Integer.parseInt(tfBookId.getText());
        int memberId = Integer.parseInt(tfMemberId.getText());
        String returnedYear = cmbReturnYear.getSelectedItem().toString();
        String returnedMonth = cmbReturnMonth.getSelectedItem().toString();
        String returnedDate = cmbReturnDate.getSelectedItem().toString();
        
        String returnDay = returnedYear + "-" + returnedMonth + "-" + returnedDate;
         
        Book book = new Book();
        
        book.setReturnBookDetails(bookId, memberId, returnDay);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void tfBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookIdActionPerformed

    private void cmbReturnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReturnYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbReturnYearActionPerformed

    private void cmbReturnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReturnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbReturnDateActionPerformed

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
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImg;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbReturnDate;
    private javax.swing.JComboBox<String> cmbReturnMonth;
    private javax.swing.JComboBox<String> cmbReturnYear;
    private javax.swing.JPanel formAddMember;
    private javax.swing.JPanel formHeader;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField tfBookId;
    private javax.swing.JTextField tfMemberId;
    // End of variables declaration//GEN-END:variables
}
