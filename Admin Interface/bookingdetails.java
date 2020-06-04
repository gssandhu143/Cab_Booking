
 class bookingdetails {
     int bookingid;
     String priceperday;
     String startdate;
     String enddate;
     String noofdays;
     String rent;
     String security;
     String name;
     String phone;
     String address;
     String email;
     String bookingtime;
     int carid;
     String status;

    public bookingdetails(int bookingid, String priceperday, String startdate, String enddate, String noofdays, String rent, String security, String name, String phone, String address, String email, String bookingtime, int carid,String status) {
        this.bookingid = bookingid;
        this.priceperday = priceperday;
        this.startdate = startdate;
        this.enddate = enddate;
        this.noofdays = noofdays;
        this.rent = rent;
        this.security = security;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.bookingtime = bookingtime;
        this.carid = carid;
        this.status= status;
    }

    
     
       
}
