
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class addcars extends javax.swing.JFrame {
    
    JFileChooser jFileChooser=new JFileChooser();
    File f;
    public addcars() 
    {
        initComponents();
       setSize(580,600);
       setTitle("Add Cars");
        setVisible(true);
        
        
         cb1.addItem("--Select Brand---");
         for(int i=0;i<globaldata.brand.length;i++)
        {
           
            cb1.addItem(globaldata.brand[i]);
            
        }
         for(int i=0;i<globaldata.type.length;i++)
         {
           
            cb2.addItem(globaldata.type[i]);
            
        }
         for(int i=0;i<globaldata.fuel.length;i++)
         {
           
            cb3.addItem(globaldata.fuel[i]);
            
        }
         setSize(600,700);
        setLocation(100,100);
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();
        cb2 = new javax.swing.JComboBox();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        cb3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        bt2 = new javax.swing.JButton();
        tf5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb1.setText("Car Name");
        getContentPane().add(lb1);
        lb1.setBounds(30, 20, 70, 30);

        lb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb2.setText("Brand");
        getContentPane().add(lb2);
        lb2.setBounds(30, 80, 60, 20);

        lb3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb3.setText("Car Type");
        getContentPane().add(lb3);
        lb3.setBounds(30, 140, 60, 20);

        lb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb4.setText("Fuel Type");
        getContentPane().add(lb4);
        lb4.setBounds(30, 200, 60, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Price Per Day Without Driver");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 260, 190, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Price Per Day With Driver");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 330, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Security");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 390, 60, 30);
        getContentPane().add(tf1);
        tf1.setBounds(280, 20, 140, 30);

        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(280, 80, 140, 30);

        getContentPane().add(cb2);
        cb2.setBounds(280, 140, 140, 30);
        getContentPane().add(tf2);
        tf2.setBounds(280, 270, 140, 30);
        getContentPane().add(tf3);
        tf3.setBounds(280, 330, 140, 30);

        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        getContentPane().add(tf4);
        tf4.setBounds(280, 390, 140, 30);

        getContentPane().add(cb3);
        cb3.setBounds(280, 200, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PHOTO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 450, 60, 15);

        bt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt2.setText("Browse......");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(470, 450, 100, 30);
        getContentPane().add(tf5);
        tf5.setBounds(280, 450, 140, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gupta's\\Documents\\NetBeansProjects\\cabbooking 2\\cabbooking 2\\src\\photos\\add.png")); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 530, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ItemStateChanged

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        int ans=jFileChooser.showOpenDialog(this);
       if(ans==JFileChooser.APPROVE_OPTION)
       {
           f=jFileChooser.getSelectedFile();
           tf5.setText(f.getPath());
           
       }
       else
       {
           tf5.setText("");
                   
       }                             
       
    }//GEN-LAST:event_bt2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cname=tf1.getText();
      String bname=cb1.getSelectedItem().toString();
      String ctype=cb2.getSelectedItem().toString();
      String ftype=cb3.getSelectedItem().toString();
      String woutd=tf2.getText(); 
      String wd=tf3.getText(); 
      String security=tf4.getText(); 
    
   
      
        
        try {
            HttpResponse<String> httpobj = Unirest.get("http://localhost:8888/AdminLogin").
                    queryString("carname",cname)
                    .queryString("brandname",bname).queryString("cartype",ctype)
                    .queryString("fueltype",ftype).queryString("pricewithoutdriver",woutd)
                    .queryString("pricewithdriver",wd).queryString("security",security).asString();
       
            if(httpobj.getStatus()==200)
            {
                if(httpobj.getBody().equals("success"))
                {
                    System.out.println("success");
                    adminpage obj=new adminpage(user);
                }
                else
                {
                   JOptionPane.showMessageDialog(this, httpobj.getBody());
                }
            }
        
        
        
        
        }
        catch (UnirestException ex) 
        {
            ex.printStackTrace();
        }                 
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
            java.util.logging.Logger.getLogger(addcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
