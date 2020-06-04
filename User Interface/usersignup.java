

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class usersignup extends javax.swing.JFrame {

   String user;
    public usersignup() {
        initComponents();
          for(int i=0;i<globaldata.sques.length;i++)
        {
           
            cb1.addItem(globaldata.sques[i]);
            
        }
          setSize(500,600);
          setLocation(100,100);
          setTitle("User Signup");
       
          setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        pf2 = new javax.swing.JPasswordField();
        cb1 = new javax.swing.JComboBox();
        bt1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 80, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 280, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Phone no.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 230, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 330, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Security Question");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 380, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Security Answer");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 440, 110, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 180, 60, 20);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(250, 80, 210, 30);
        getContentPane().add(tf4);
        tf4.setBounds(250, 430, 210, 30);

        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        getContentPane().add(tf3);
        tf3.setBounds(250, 230, 210, 30);

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2);
        tf2.setBounds(250, 180, 210, 30);

        pf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf1ActionPerformed(evt);
            }
        });
        getContentPane().add(pf1);
        pf1.setBounds(250, 280, 210, 30);

        pf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf2ActionPerformed(evt);
            }
        });
        getContentPane().add(pf2);
        pf2.setBounds(250, 330, 210, 30);

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(250, 380, 210, 30);

        bt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt1.setText("SignUp");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(190, 480, 100, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("USER SIGNUP");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, -10, 200, 90);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 140, 40, 14);

        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });
        getContentPane().add(tf5);
        tf5.setBounds(250, 130, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        user=tf1.getText();
        String email=tf2.getText();
        String phone = tf3.getText();
        String pass=pf1.getText();
         String cpass=pf2.getText();
         String sques=cb1.getSelectedItem().toString();
         String sans=tf4.getText();
         String name=tf5.getText();
         if(user.equals("")|| email.equals("")||phone.equals("")|| pass.equals("")||cpass.equals("")||sques.equals("")||
                 sans.equals("")|| name.equals(""))
         {
             JOptionPane.showMessageDialog(this, "All Fields Are Required!!");
         }
         else
         {  if(pass.equals(cpass))
         {   HttpResponse <String> httpobj;
           try {
               httpobj = Unirest.get("http://localhost:8888/usersignup").queryString("user",user).queryString("name",name).queryString("email",email)
                       .queryString("phone",phone).queryString("pass",pass).queryString("cpass",cpass).queryString("sques",sques)
                       .queryString("sans",sans).asString();
                if(httpobj.getStatus()==200)
               {
                    if(httpobj.getBody().equals("SignUp Successfully"))
                {
                    
                     userlogin obj=new userlogin();
                }
                else
                {
                   JOptionPane.showMessageDialog(this, httpobj.getBody());
                }
               }
           } catch (UnirestException ex) {
               Logger.getLogger(usersignup.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Password and Confirm Password Doesn't match!!!");
         }
         }
         
        
    }//GEN-LAST:event_bt1ActionPerformed

    private void pf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf2ActionPerformed

    private void pf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf1ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

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
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
