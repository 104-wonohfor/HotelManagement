/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

import dao.RoomBookingDAO;
import dao.RoomDAO;
import dao.PersonDAO;
import model.Person;
import model.Room;
/**
 *
 * @author Thang
 */
public class ConfirmBook extends javax.swing.JFrame {

    private String userID;


    public ConfirmBook() {
        setTitle("Confirm Book");
        getContentPane().setBackground(java.awt.Color.DARK_GRAY);
        initComponents();
        loadRoomBookingTable("Only Requested");
    }

    public ConfirmBook(String userID) {
        this.userID = userID;
        System.out.println("Confirm Book: " + userID);

        setTitle("Confirm Book");
        getContentPane().setBackground(java.awt.Color.DARK_GRAY);
        initComponents();
        loadRoomBookingTable("Only Requested");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmButton = new javax.swing.JToggleButton();
        cancelButton = new javax.swing.JToggleButton();
        choiceBox = new javax.swing.JComboBox<>();
        jLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bedsFld = new javax.swing.JTextField();
        roomTypeFld = new javax.swing.JTextField();
        UsernameTxt2 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        UsernameTxt1 = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JLabel();
        guestNameFld = new javax.swing.JTextField();
        UsernameTxt3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));
        setResizable(false);

        confirmButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        choiceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Only Requested", "All" }));
        choiceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceBoxActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel.setForeground(new java.awt.Color(215, 210, 203));
        jLabel.setText("Choice");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        bedsFld.setDisabledTextColor(java.awt.Color.black);
        bedsFld.setEnabled(false);

        roomTypeFld.setDisabledTextColor(java.awt.Color.black);
        roomTypeFld.setEnabled(false);

        UsernameTxt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameTxt2.setForeground(new java.awt.Color(215, 210, 203));
        UsernameTxt2.setText("Room Type");

        phoneField.setDisabledTextColor(java.awt.Color.black);
        phoneField.setEnabled(false);

        UsernameTxt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameTxt1.setForeground(new java.awt.Color(215, 210, 203));
        UsernameTxt1.setText("Phone");

        UsernameTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameTxt.setForeground(new java.awt.Color(215, 210, 203));
        UsernameTxt.setText("Guest Name");

        guestNameFld.setDisabledTextColor(java.awt.Color.black);
        guestNameFld.setEnabled(false);

        UsernameTxt3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameTxt3.setForeground(new java.awt.Color(215, 210, 203));
        UsernameTxt3.setText("Bed(s)");

        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(confirmButton)
                .addGap(49, 49, 49)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(UsernameTxt2)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UsernameTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(roomTypeFld)
                    .addComponent(guestNameFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(UsernameTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bedsFld))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(UsernameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedsFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadRoomBookingTable(String choice){
        RoomBookingDAO roomBookingDAO = new RoomBookingDAO();
        jTable2.setModel(roomBookingDAO.getRoomBooking(choice));
    }

    private void choiceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceBoxActionPerformed
        // TODO add your handling code here:
        loadRoomBookingTable(choiceBox.getSelectedItem().toString());        
    }//GEN-LAST:event_choiceBoxActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        // chỉ row nào có bookingStatus là "REQUESTED" hoặc "CANCELLED" thì mới chuyển về CONFIRMED
        int row = jTable2.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to confirm");
            return;
        } else {
            String bookingStatus = jTable2.getValueAt(row, 4).toString();
            if (!bookingStatus.equals("REQUESTED") && !bookingStatus.equals("CANCELLED")) {
                JOptionPane.showMessageDialog(this, "Only REQUESTED or CANCELLED booking can be confirmed");
                return;
            }
            int bookingID = Integer.parseInt(jTable2.getValueAt(row, 0).toString());
            RoomBookingDAO roomBookingDAO = new RoomBookingDAO();
            roomBookingDAO.updateBookingStatus(bookingID, "CONFIRMED");
            loadRoomBookingTable(choiceBox.getSelectedItem().toString());
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        // chỉ row nào có bookingStatus là "REQUESTED" hoặc "CONFIRMED" thì mới chuyển về CANCELLED
        int row = jTable2.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to cancel");
            return;
        } else {
            String bookingStatus = jTable2.getValueAt(row, 4).toString();
            if (!bookingStatus.equals("REQUESTED") && !bookingStatus.equals("CONFIRMED")) {
                JOptionPane.showMessageDialog(this, "Only REQUESTED or CONFIRMED booking can be cancelled");
                return;
            }
            int bookingID = Integer.parseInt(jTable2.getValueAt(row, 0).toString());
            RoomBookingDAO roomBookingDAO = new RoomBookingDAO();
            roomBookingDAO.updateBookingStatus(bookingID, "CANCELLED");
            loadRoomBookingTable(choiceBox.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        // if userID starts with "G" then back to DashboardGuest, with "R" then back to DashboardReceptionist, with "M" then back to DashboardManager
        if (userID.startsWith("G")) {
            new DashboardGuest(userID).setVisible(true);
        } else if (userID.startsWith("R")) {
            try {
                new DashboardReceptionist(userID).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (userID.startsWith("M")) {
            try {
                new DashboardManager(userID).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        String guestID = jTable2.getValueAt(row, 7).toString();

        Person person = new PersonDAO().getPersonByID(guestID);
        guestNameFld.setText(person.getName());
        phoneField.setText(person.getPhone());       

        Room room = new RoomDAO().getRoomByRoomNumber(Integer.parseInt(jTable2.getValueAt(row, 1).toString()));
        roomTypeFld.setText(room.getStyle().toString());
        bedsFld.setText(String.valueOf(room.getNumBeds()));
    }//GEN-LAST:event_jTable2MousePressed

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
            java.util.logging.Logger.getLogger(ConfirmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsernameTxt;
    private javax.swing.JLabel UsernameTxt1;
    private javax.swing.JLabel UsernameTxt2;
    private javax.swing.JLabel UsernameTxt3;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bedsFld;
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JComboBox<String> choiceBox;
    private javax.swing.JToggleButton confirmButton;
    private javax.swing.JTextField guestNameFld;
    private javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField roomTypeFld;
    // End of variables declaration//GEN-END:variables
}
