import com.vmm.JHTTPServer;
import static com.vmm.NanoHTTPD.HTTP_OK;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class webserver extends JHTTPServer {

    public webserver(int port) throws IOException {
        super(port);

    }

    @Override
    public Response serve(String uri, String method, Properties header, Properties parms, Properties files) {

        Response res;
        res = new Response(HTTP_OK, "text/html", "<body style='background: #D46A6A; color: #fff'><center><h1>Hello</h1><br> <h3>Welcome To JHTTP Server (Version 1.0)</h3></body></center>");

        if (uri.contains("/AdminLogin")) {
            String u = parms.getProperty("email");
            String p = parms.getProperty("password");

            System.out.println(u + " " + p);

            try {
                ResultSet rs = DBLoader.executeQuery("select * from adminlogin where email='" + u + "' and password ='" + p + "'");

                if (rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "success");
                    System.out.println("login");

                } else {
                    res = new Response(HTTP_OK, "text/plain", "failed");
                    System.out.println("failed");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (uri.contains("/cars")) {
            try {
                String cname = parms.getProperty("carname");
                String brand = parms.getProperty("brandname");
                String type = parms.getProperty("cartype");
                String woutd = parms.getProperty("pricewithoutdriver");
                String fuel = parms.getProperty("fueltype");
                String wd = parms.getProperty("pricewithdriver");
                String security = parms.getProperty("security");
                
//                String photo=saveFileOnServerWithRandomName(files, parms, "photo", "src/photos");
                String photo=saveFileOnServerWithRandomName(files, parms, "photo", "src/photos");

                System.out.println(cname);
                System.out.println(brand);
                System.out.println(fuel);
                System.out.println(wd);
                System.out.println(security);
                System.out.println(photo);

                ResultSet rs = DBLoader.executeQuery("Select * from cars");

                rs.moveToInsertRow();
                rs.updateString("carname", cname);
                rs.updateString("brandname", brand);
                rs.updateString("cartype", type);
                rs.updateString("fueltype", fuel);
                rs.updateString("pricewithoutdriver", woutd);
                rs.updateString("pricewithdriver", wd);
                rs.updateString("security", security);
                rs.updateString("photo","src/photos/"+photo);
                rs.insertRow();
                res = new Response(HTTP_OK, "text/plain", "Data Added");

            } catch (Exception ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (uri.contains("/adminchangepassword")) {
            String em = parms.getProperty("email");
            String op = parms.getProperty("oldpassword");
             String np = parms.getProperty("newpassword");
             
              ResultSet rs = DBLoader.executeQuery("select * from adminlogin where email='" + em + "' and password ='" + op + "'");

            try {
                if (rs.next())
                {  
                    rs.updateString("password", np);
                    rs.updateRow();
                    res = new Response(HTTP_OK, "text/plain", "Password Updated Successfully");
                }
                else
                {
                     res = new Response(HTTP_OK, "text/plain", "Password not Updated ");
                    
                     
                }
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          }
        else if (uri.contains("/managecars"))
        {
            
            //to fetch all cars
            String ans="";
             ResultSet rs = DBLoader.executeQuery("select * from cars");
            try {
                while(rs.next())
                {
                    int carid=rs.getInt("carid");
                    String cname=rs.getString("carname");
                    String bname=rs.getString("brandname");
                    String ctype=rs.getString("cartype");
                    String ftype=rs.getString("fueltype");
                   int woutd=rs.getInt("pricewithoutdriver");
                    int wd=rs.getInt("pricewithdriver");
                     int security=rs.getInt("security");
                     String photo=rs.getString("photo");
                     ans=ans+carid+";"+cname+";"+bname+";"+ctype+";"+ftype+";"+woutd+";"+wd+";"+security+";"+photo+"~";
                      res = new Response(HTTP_OK, "text/plain",ans);
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
       else if (uri.contains("/deletecars"))
       {
           int carid =Integer.parseInt( parms.getProperty("carid"));
            ResultSet rs = DBLoader.executeQuery("select * from cars where carid='" + carid + "'" );
            try {
                if(rs.next())
                {
                    rs.deleteRow();
                    res = new Response(HTTP_OK, "text/plain", "Row Deleted ");
                    
                }
                else
                {
                    
                    res = new Response(HTTP_OK, "text/plain", "No Record Found ");
                }    } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
         else if (uri.contains("/usersignup"))
       {
         String user = parms.getProperty("user");
            String email  = parms.getProperty("email");
            String name= parms.getProperty("name");
                String phone = parms.getProperty("phone");
                String pass = parms.getProperty("pass");
                String cpass = parms.getProperty("cpass");
                String sques = parms.getProperty("sques");
                String sans = parms.getProperty("sans");  
                
                 ResultSet rs = DBLoader.executeQuery("select * from usersignup where username='" + user+ "'" );
           
            try {
                if(rs.next())
                {
                    res = new Response(HTTP_OK, "text/plain","Username Already Exists!!!");
                }
                else
                {      
                    rs.moveToInsertRow();
                    rs.updateString("username", user);
                    rs.updateString("name", name);
                    rs.updateString("email", email);
                    rs.updateString("phone", phone);
                    rs.updateString("password", pass);
                    rs.updateString("securityques", sques);
                    rs.updateString("securityans",sans);
                    
                    rs.insertRow();
                    res = new Response(HTTP_OK, "text/plain", "SignUp Successfully");
                    
                }    } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
         if (uri.contains("/userlogin")) {
            String u = parms.getProperty("uname");
            String p = parms.getProperty("pass");

          ResultSet rs = DBLoader.executeQuery("select * from usersignup where username='" + u + "' and password ='" + p + "'");
            try {
                if (rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "login success");
                    System.out.println("login");

                } else {
                    res = new Response(HTTP_OK, "text/plain", "login failed");
                    System.out.println("failed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
          else if (uri.contains("/userchangepassword")) {
            String uname = parms.getProperty("uname");
            String op = parms.getProperty("oldpassword");
             String np = parms.getProperty("newpassword");
             
              ResultSet rs = DBLoader.executeQuery("select * from usersignup where username='" + uname + "' and password ='" + op + "'");

            try {
                if (rs.next())
                {  
                    rs.updateString("password", np);
                    rs.updateRow();
                    res = new Response(HTTP_OK, "text/plain", "Password Updated Successfully");
                }
                else
                {
                     res = new Response(HTTP_OK, "text/plain", "Password not Updated ");
                    
                     
                }
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          }
         
          else if (uri.contains("/getcardata"))
       {
        String ans="";
                
                 ResultSet rs = DBLoader.executeQuery("select * from cars");
            try {
                while(rs.next())
                {
                     String carid = rs.getString("carid");
            String cname  = rs.getString("carname");
            String bname=rs.getString("brandname");
                String ctype =rs.getString("cartype");
                String fuel =rs.getString("fueltype");
                String woutd = rs.getString("pricewithoutdriver");
                String wd =rs.getString("pricewithdriver");
                String security = rs.getString("security"); 
                 String photo= rs.getString("photo");
                    System.out.println(carid+";"+cname+";"+bname+";"+ctype+";"+fuel+";"+woutd+";"+wd+";"+security+";"+photo);
                     ans=ans+carid+";"+cname+";"+bname+";"+ctype+";"+fuel+";"+woutd+";"+wd+";"+security+";"+photo+"~";
                    
                  res = new Response(HTTP_OK, "text/plain", ans);  
                }  
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         
         
         
       }
         else if (uri.contains("/searchbytype"))
         {
             String ans="";
                 String ctype = parms.getProperty("cartype");
                 ResultSet rs = DBLoader.executeQuery("select * from cars where cartype='"+ctype+"'");
                 
                 
//                 select * from user where email = 'abc' and password = '123'
            try {
                while(rs.next())
                {
                      String carid = rs.getString("carid");
            String cname  = rs.getString("carname");
            String bname=rs.getString("brandname");
              //  String ctype =rs.getString("cartype");
                String fuel =rs.getString("fueltype");
                String woutd = rs.getString("pricewithoutdriver");
                String wd =rs.getString("pricewithdriver");
                String security = rs.getString("security"); 
                 String photo= rs.getString("photo");
//                    System.out.println(carid+";"+cname+";"+bname+";"+ctype+";"+fuel+";"+woutd+";"+wd+";"+security+";"+photo);
                     ans=ans+carid+";"+cname+";"+bname+";"+ctype+";"+fuel+";"+woutd+";"+wd+";"+security+";"+photo+"~";
                    System.out.println(ans);
                  res = new Response(HTTP_OK, "text/plain", ans);
                    
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
         }
         else  if (uri.contains("/GetResource")) //request should be of the form /GetResource/src/content/one.jpg
        {
            uri = uri.substring(1);
            uri = uri.substring(uri.indexOf("/") + 1);
            System.out.println(uri +" *** " );
            res = sendCompleteFile(uri);
        } 
          else if (uri.contains("/ConfirmBooking"))
          {
            try {
                String name = parms.getProperty("name");
                String email  = parms.getProperty("email");
                String address= parms.getProperty("address");
                String phone = parms.getProperty("phone");
                String radio = parms.getProperty("radio");
                String startdate= parms.getProperty("startdate");
                String enddate = parms.getProperty("enddate");
                String getdays = parms.getProperty("getdays");
                String rent  = parms.getProperty("rent");
                String security = parms.getProperty("security");
                String status = parms.getProperty("status");
                int carid = Integer.parseInt(parms.getProperty("carid"));
                
                
                
                ResultSet rs = DBLoader.executeQuery("select * from booking");
                rs.moveToInsertRow();
                rs.updateString("priceperday",radio);
                rs.updateString("startdate",startdate);
                rs.updateString("enddate",enddate);
                rs.updateString("no_of_days",getdays);
                rs.updateString("rent",rent);
                rs.updateString("security",security);
                rs.updateString("name",name);
                rs.updateString("phone",phone);
                rs.updateString("address",address);
                rs.updateString("email",email);
                rs.updateString("status",status);
                rs.updateInt("carid",carid);
                
                 rs.insertRow();
                res = new Response(HTTP_OK,"text/plain","Car BOOked");
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
               
          }
         else if (uri.contains("/fetchBookings"))
          {
              String ans ="";
              
              ResultSet rs=DBLoader.executeQuery("select * from booking");
            try {
                while(rs.next())
                {
//                   int bookingid  = rs.getInt("bookingid");
                   
                   int bookingid = rs.getInt("bookingid");
                   String priceperday=rs.getString("priceperday");
                   String startdate=rs.getString("startdate");
                   String enddate=rs.getString("enddate");
                   String noofdays=rs.getString("no_of_days");
                   String rent=rs.getString("rent");
                   String security=rs.getString("security");
                   String name=rs.getString("name");
                   String phone=rs.getString("phone");
                   String address=rs.getString("address");
                   String email=rs.getString("email");
                   String status=rs.getString("status");
                   int carid = rs.getInt("carid");
                   String bookingtime = rs.getString("bookingtime");
                   ans= ans+ bookingid+";"+priceperday+";"+startdate+";"+enddate+";"+noofdays+";"+rent+";"
                           +security+";"+name+";"+phone+";"+address+";"+email+";"+status+";"+carid+";"+bookingtime+"~";
                    System.out.println(ans);
                    res = new Response(HTTP_OK,"text/plain",ans);
                }
            } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         else if (uri.contains("/canceltheride")) {
            int bookingid= Integer.parseInt(parms.getProperty("bookingid"));
            String status= parms.getProperty("status");
            ResultSet rs = DBLoader.executeQuery("select * from booking where bookingid='" + bookingid + "'" );
            try {
                if(rs.next())
                {
                   
                    rs.updateString("status",status);
                     rs.updateRow();
                    res = new Response(HTTP_OK, "text/plain", "Ride cancelled ");
                    
                }
                else
                {
                    
                    res = new Response(HTTP_OK, "text/plain", "No Record Found ");
                }    } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        
                
          
          
          
          
          
          return res; 
    }
         

       
}



