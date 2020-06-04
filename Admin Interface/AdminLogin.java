
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class AdminLogin extends javax.swing.JFrame
{

    
    public AdminLogin()
    {
        initComponents();
        setSize(700,500);
        setTitle("Admin Login");
       
        setVisible(true);
      
        jLabel2.setIcon(new ImageIcon("src/photos/adminlogin.jpg"));
         getContentPane().setBackground(Color.white);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        bt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1.setText("Email");
        getContentPane().add(lb1);
        lb1.setBounds(330, 90, 70, 30);

        lb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb2.setText("Password");
        getContentPane().add(lb2);
        lb2.setBounds(330, 160, 120, 20);
        getContentPane().add(tf1);
        tf1.setBounds(470, 90, 190, 30);
        getContentPane().add(pf1);
        pf1.setBounds(470, 150, 190, 30);

        bt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gupta's\\Documents\\NetBeansProjects\\cabbooking 2\\cabbooking 2\\src\\photos\\key_login.png")); // NOI18N
        bt1.setText("Login");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(390, 240, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ADMIN LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 20, 190, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 30, 270, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
      String user=tf1.getText();
      String pass=pf1.getText();
        
        try {
            HttpResponse<String> httpobj = Unirest.get("http://localhost:8888/AdminLogin").
                    queryString("email",user)
                    .queryString("password",pass).asString();
       
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
    }//GEN-LAST:event_bt1ActionPerformed

   
    public static void main(String args[]) 
    {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
