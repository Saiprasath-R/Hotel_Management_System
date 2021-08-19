
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import project.Select;
import project.InsertUpdateDelete;
public class customerCheckIn extends javax.swing.JFrame {
    String bed;
    String roomType;
    String roomNo;
    String price;
   
    public customerCheckIn(){
        initComponents();
        checkInF.setEditable(false);
        priceF.setEditable(false);
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal=Calendar.getInstance();
        checkInF.setText(myFormat.format(cal.getTime()));   
    }
    public void roomDetails(){
        roomNumCBox.removeAllItems();
        priceF.setText("");
        bed=(String)bedCBox.getSelectedItem();
        roomType=(String)roomTypeCBox.getSelectedItem();
        try{
            ResultSet rs=Select.getData("SELECT * FROM room WHERE bed= '"+bed+"' AND roomType='"+roomType+"' AND status='Not Booked' ");
            while(rs.next()){
                roomNumCBox.addItem(rs.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
                    
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobNumF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        natF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genderCBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        emailF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idPrrofF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addressF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        checkInF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bedCBox = new javax.swing.JComboBox<>();
        roomTypeCBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        roomNumCBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        priceF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Registration & Check IN.png"))); // NOI18N
        jLabel1.setText("CUSTOMER CHECK IN");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 13, 246, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 149, -1, -1));

        nameF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(nameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 172, 246, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("MOBILE NUMBER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 212, -1, -1));

        mobNumF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(mobNumF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 241, 246, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("NATIONALITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 281, -1, -1));

        natF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(natF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 315, 246, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 355, -1, -1));

        genderCBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        genderCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));
        getContentPane().add(genderCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 384, 246, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("EMAIL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 424, -1, -1));

        emailF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(emailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 453, 246, -1));

        jLabel7.setText("ID PROOF");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 149, -1, -1));
        getContentPane().add(idPrrofF, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 172, 246, -1));

        jLabel8.setText("ADDRESS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 212, -1, -1));
        getContentPane().add(addressF, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 241, 246, -1));

        jLabel9.setText("CHECK IN DATE (TODAY)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 281, -1, -1));
        getContentPane().add(checkInF, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 315, 246, -1));

        jLabel10.setText("BED");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 149, -1, -1));

        jLabel11.setText("ROOM TYPE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 212, -1, -1));

        bedCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "DOUBLE", "TRIPLE" }));
        bedCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedCBoxActionPerformed(evt);
            }
        });
        getContentPane().add(bedCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 172, 245, -1));

        roomTypeCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        roomTypeCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeCBoxActionPerformed(evt);
            }
        });
        getContentPane().add(roomTypeCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 241, 245, -1));

        jLabel12.setText("ROOM NUMBER");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 281, -1, -1));

        roomNumCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumCBoxActionPerformed(evt);
            }
        });
        getContentPane().add(roomNumCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 250, -1));

        jLabel13.setText("PRICE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 355, -1, -1));
        getContentPane().add(priceF, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 384, 246, -1));

        jButton1.setText("ALLOT ROOM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 452, 120, 50));

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 510, 120, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 30, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new customerCheckIn().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bedCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedCBoxActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_bedCBoxActionPerformed

    private void roomTypeCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeCBoxActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_roomTypeCBoxActionPerformed

    private void roomNumCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumCBoxActionPerformed
        // TODO add your handling code here:
        roomNo=(String)roomNumCBox.getSelectedItem();
        try{
            ResultSet rs=Select.getData("SELECT * FROM room WHERE roomNo='"+roomNo+"'");
            while(rs.next()){
                priceF.setText(rs.getString(4));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_roomNumCBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=1;
        String name=nameF.getText();
        String mobileNumber=mobNumF.getText();
        String nationality=natF.getText();
        String gender=(String)genderCBox.getSelectedItem();
        String email=emailF.getText();
        String idProof=idPrrofF.getText();
        String address=addressF.getText();
        String checkIn=checkInF.getText();
        String bed=(String)bedCBox.getSelectedItem();
        String roomType=(String)roomTypeCBox.getSelectedItem();
      //  String gender=(String)genderCBox.getSelectedItem();
        String roomNo=(String) roomNumCBox.getSelectedItem();
        String price=priceF.getText();
        String query="SELECT max(id) FROM customer";
        try{
            ResultSet rs=Select.getData(query);
            while(rs.next()) id=rs.getInt(1);
            id+=1;
            if(!price.equals("")){
                query="UPDATE room SET status='Booked' WHERE roomNo='"+roomNo+"'";
                InsertUpdateDelete.setData(query,"");
                query="INSERT INTO customer(id,name,mobileNumber,nationality,gender,email,idProof,address,checkIn,roomNo,bed,roomType,pricePerDay) VALUES("+id+",'"+name+"','"+mobileNumber+"','"+nationality+"','"+gender+"','"+email+"','"+idProof+"','"+address+"','"+checkIn+"','"+roomNo+"','"+bed+"','"+roomType+"','"+price+"')";
                InsertUpdateDelete.setData(query," Customer CHECK IN successfully! ");
                setVisible(false);
                new customerCheckIn().setVisible(true );
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(customerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressF;
    private javax.swing.JComboBox<String> bedCBox;
    private javax.swing.JTextField checkInF;
    private javax.swing.JTextField emailF;
    private javax.swing.JComboBox<String> genderCBox;
    private javax.swing.JTextField idPrrofF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobNumF;
    private javax.swing.JTextField nameF;
    private javax.swing.JTextField natF;
    private javax.swing.JTextField priceF;
    private javax.swing.JComboBox<String> roomNumCBox;
    private javax.swing.JComboBox<String> roomTypeCBox;
    // End of variables declaration//GEN-END:variables
}
