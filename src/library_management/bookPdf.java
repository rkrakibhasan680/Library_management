/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author rkrakib
 */
public class bookPdf extends javax.swing.JFrame {

    /**
     * Creates new form bookPdf
     */
    public bookPdf() {
        initComponents();
        jPanel2.setBackground(new java.awt.Color(0,0,0,120));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton_registationBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Unispace", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PDF BOOK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 130, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton1.setText("Bangla_10125");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 310, -1));

        jSeparator12.setBackground(new java.awt.Color(0, 204, 209));
        jSeparator12.setForeground(new java.awt.Color(0, 204, 209));
        jSeparator12.setOpaque(true);
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 180, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton2.setText("Statistical_Techniques_in_Business_and_E");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 310, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton3.setText("Physics_book_5421");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 310, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton4.setText("Math_book_1254");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 310, -1));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton5.setText("English_101");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 310, -1));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton6.setText("Database System Concepts");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 310, -1));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton9.setText("Chemistry_book_9874");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 310, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_registationBtn.setBackground(new java.awt.Color(255, 255, 255));
        jButton_registationBtn.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jButton_registationBtn.setForeground(new java.awt.Color(0, 204, 209));
        jButton_registationBtn.setText("Exit");
        jButton_registationBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 209), 1, true));
        jButton_registationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_registationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registationBtnActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_registationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 110, 20));

        jLabel15.setBackground(new java.awt.Color(204, 51, 0));
        jLabel15.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 20, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PdfFile/bookbgpdf.jpg"))); // NOI18N
        jLabel1.setText("Book List");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
       File file= new File("C:\\Users\\rkrak\\Desktop\\varsity\\DBMS\\lav4\\Library_management\\src\\PdfFile\\English_101.pdf");
       if(file.exists()){
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
        }else{
          JOptionPane.showMessageDialog(this,"not supported!");
        }
       }else{
           JOptionPane.showMessageDialog(this,"File not show!");
       }
       }catch(Exception e){
       }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       try{
       File file= new File("C:\\Users\\rkrak\\Desktop\\varsity\\DBMS\\lav4\\Library_management\\src\\PdfFile\\Chemistry_book_12345.pdf");
       if(file.exists()){
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
        }else{
          JOptionPane.showMessageDialog(this,"not supported!");
        }
       }else{
           JOptionPane.showMessageDialog(this,"File not show!");
       }
       }catch(Exception e){
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
       File file= new File("C:\\Users\\rkrak\\Desktop\\varsity\\DBMS\\lav4\\Library_management\\src\\PdfFile\\Statistical_Techniques_in_Business_and_E.pdf");
       if(file.exists()){
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
        }else{
          JOptionPane.showMessageDialog(this,"not supported!");
        }
       }else{
           JOptionPane.showMessageDialog(this,"File not show!");
       }
       }catch(Exception e){
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
       File file= new File("C:\\Users\\rkrak\\Desktop\\varsity\\DBMS\\lav4\\Library_management\\src\\PdfFile\\Database System Concepts.pdf");
       if(file.exists()){
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
        }else{
          JOptionPane.showMessageDialog(this,"not supported!");
        }
       }else{
           JOptionPane.showMessageDialog(this,"File not show!");
       }
       }catch(Exception e){
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
       File file= new File("C:\\Users\\rkrak\\Desktop\\varsity\\DBMS\\lav4\\Library_management\\src\\PdfFile\\Bangla.pdf");
       if(file.exists()){
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
        }else{
          JOptionPane.showMessageDialog(this,"not supported!");
        }
       }else{
           JOptionPane.showMessageDialog(this,"File not show!");
       }
       }catch(Exception e){
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try{
       File file= new File("C:\\Users\\rkrak\\Desktop\\varsity\\DBMS\\lav4\\Library_management\\src\\PdfFile\\Math_book_1254.pdf");
       if(file.exists()){
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
        }else{
          JOptionPane.showMessageDialog(this,"not supported!");
        }
       }else{
           JOptionPane.showMessageDialog(this,"File not show!");
       }
       }catch(Exception e){
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
       File file= new File("C:\\Users\\rkrak\\Desktop\\varsity\\DBMS\\lav4\\Library_management\\src\\PdfFile\\Physics_Book_5421.pdf");
       if(file.exists()){
        if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
        }else{
          JOptionPane.showMessageDialog(this,"not supported!");
        }
       }else{
           JOptionPane.showMessageDialog(this,"File not show!");
       }
       }catch(Exception e){
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_registationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registationBtnActionPerformed
       this.setVisible(false);
       new LoginAuthor().setVisible(true);
        
    }//GEN-LAST:event_jButton_registationBtnActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(bookPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookPdf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_registationBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator12;
    // End of variables declaration//GEN-END:variables
}
