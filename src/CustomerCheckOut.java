/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import project.Select;
import project.InsertUpdateDelete;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author ASUS
 */
public class CustomerCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        nameF.setEditable(false);
        mobNumF.setEditable(false);
        emailF.setEditable(false);
        checkInF.setEditable(false);
        checkOutF.setEditable(false);
        pricePerDayF.setEditable(false);
        totAmountF.setEditable(false);
        numOfDaysF.setEditable(false);
    }
    int id=0;
    String query;
    String roomType;
    String bed;
    String roomNo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        roomNumF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        mobNumF = new javax.swing.JTextField();
        emailF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkInF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        checkOutF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pricePerDayF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numOfDaysF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totAmountF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("CUSTOMER CHECK OUT");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 25, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1223, 13, 31, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));
        getContentPane().add(roomNumF, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 99, 226, -1));

        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 98, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));
        getContentPane().add(nameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 232, -1));
        getContentPane().add(mobNumF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 231, -1));
        getContentPane().add(emailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 232, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Check In Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        checkInF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInFActionPerformed(evt);
            }
        });
        getContentPane().add(checkInF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 232, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Check Out Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));
        getContentPane().add(checkOutF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 231, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Price per day");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, -1));
        getContentPane().add(pricePerDayF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Number of Days Stay");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, -1, -1));
        getContentPane().add(numOfDaysF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("TOTAL AMOUNT TO BE PAYED");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, -1, -1));
        getContentPane().add(totAmountF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 260, 114, 34));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "CheckIn Date", "Room Number", "Bed", "Room Type", "Price Per Day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 1250, 280));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CHECK OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, 50));

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, -1, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_checkInFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                                                                
        String name=nameF.getText();
        String mobileNumber=mobNumF.getText();
        String email=emailF.getText();
        String checkOut=checkOutF.getText();
        String numOfDaysStay=numOfDaysF.getText();
        String totalAmount=totAmountF.getText();
        roomNo=roomNumF.getText();
        query="UPDATE customer SET numberOfDaysStay='"+numOfDaysStay+"',totalAmount='"+totalAmount+"',checkOut='"+checkOut+"' WHERE id='"+id+"'";
        InsertUpdateDelete.setData(query,"");
        query="UPDATE room SET status='Not Booked' WHERE roomNo='"+roomNo+"'";
        InsertUpdateDelete.setData(query,"");
        String path="C:\\Users\\ASUS\\Desktop\\Hotel Management System BILLS\\";        
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc,new FileOutputStream(path+""+id+".pdf"));
            doc.open();
            Paragraph paragraph =  new Paragraph   ("                                                   SPG HOTEL MANAGEMENT SYSTEM\n");
            doc.add(paragraph);
            Paragraph paragraph1 = new Paragraph   (" *************************************************************************************************************** ");
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph   ("\tBill ID: "+id+"\nCustomer Details:\nName: "+name+"\nMobile number: "+mobileNumber+"\nEmail: "+email+"\n");
            doc.add(paragraph2);
            doc.add(paragraph1);
            Paragraph paragraph3 =  new Paragraph   ("\tRoom Details:\nNumber: "+roomNumF.getText()+"\nType:\nName: "+roomType+"\nBed: "+bed+"\nPrice Per Day: "+pricePerDayF.getText()+"\n");
            doc.add(paragraph3);
            doc.add(paragraph1);

            PdfPTable tb1=new PdfPTable(4);
            tb1.addCell("Check In Date: "+checkInF.getText());
            tb1.addCell("Check Out Date: "+checkOutF.getText());
            tb1.addCell("No Of Days Stayed: "+numOfDaysStay);
            tb1.addCell("Total Amount Paid: "+totalAmount);
            doc.add(tb1);
            doc.add(paragraph1);
            doc.add(new Paragraph("Thank you, Please visit again!"));
         
        
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        doc.close();
        int a=JOptionPane.showConfirmDialog(null,"Do you want to Print The Bill","SELECT",JOptionPane.YES_NO_OPTION);
        if(a==0){
            try{
               if(new File("C:\\Users\\ASUS\\Desktop\\Hotel Management System BILLS\\"+id+".pdf").exists()){
                      Process p=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\ASUS\\Desktop\\Hotel Management System BILLS\\"+id+".pdf");
            }
               else{
                   System.out.println("File doesn't exists");
               }
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        ResultSet rs=Select.getData("SELECT * FROM customer WHERE checkOut is NULL");
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
            }
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String roomNo=roomNumF.getText();
        try{
            ResultSet rs=Select.getData("SELECT * FROM customer WHERE roomNo='"+roomNo+"' AND checkOut is NULL");
            if(rs.next()){
                roomNumF.setEditable(false);
                id=rs.getInt(1);
                nameF.setText(rs.getString(2));
                checkInF.setText(rs.getString(9));
                pricePerDayF.setText(rs.getString(13));
                mobNumF.setText(rs.getString(3));
                
               SimpleDateFormat myFormat=new SimpleDateFormat ("yyyy/MM/dd");
                Calendar cal=Calendar.getInstance();
                checkOutF.setText (myFormat. format (cal.getTime()));
                String dateBeforeString=rs.getString (9);
                java.util.Date dateBefore=myFormat.parse (dateBeforeString);
                String dateAfterStrig=myFormat.format(cal.getTime());
                java.util.Date dateAfter=myFormat.parse(dateAfterStrig);
                long difference=dateAfter.getTime() - dateBefore.getTime();
                int noofDayStay=(int) (difference/(1000*60*60*24));
                if (noofDayStay==0)
                noofDayStay=1;
                numOfDaysF.setText(String.valueOf(noofDayStay));
                float price=Float.parseFloat(pricePerDayF.getText());
                totAmountF.setText (String.valueOf(noofDayStay*price));
                emailF.setText (rs.getString(6));
                roomType=rs.getString(12);
                bed=rs.getString(11) ;
    
           }
            else{
                JOptionPane.showMessageDialog(null,"Room not Booked or Room Doesn't exists");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField checkInF;
    private javax.swing.JTextField checkOutF;
    private javax.swing.JTextField emailF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mobNumF;
    private javax.swing.JTextField nameF;
    private javax.swing.JTextField numOfDaysF;
    private javax.swing.JTextField pricePerDayF;
    private javax.swing.JTextField roomNumF;
    private javax.swing.JTextField totAmountF;
    // End of variables declaration//GEN-END:variables
}