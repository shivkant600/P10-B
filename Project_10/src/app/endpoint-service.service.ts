import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class EndpointServiceService {

  constructor() { }

  public SERVER_URL = "http://localhost:8084";
  public MESSAGE = this.SERVER_URL + "/Message";
  public USER = this.SERVER_URL + "/User";
  public ROLE = this.SERVER_URL + "/Role";
  public COLLEGE = this.SERVER_URL + "/College";
  public MARKSHEET = this.SERVER_URL + "/Marksheet";
  public STUDENT = this.SERVER_URL + "/Student";
  public SUBJECT = this.SERVER_URL + "/Subject";
  public FACULTY = this.SERVER_URL + "/Faculty";
  public COURSE = this.SERVER_URL + "/Course";
  public ORDER = this.SERVER_URL + "/Order";
  public STAFF = this.SERVER_URL + "/Staff"
  public PAYMENT= this.SERVER_URL + "/payment"
  public COUPON= this.SERVER_URL + "/Coupon"
  public TIMETABLE = this.SERVER_URL + "/TimeTable";

  public ACTIVITY = this.SERVER_URL + "/Activity";
  public SALARY = this.SERVER_URL + "/Salary";
   public INQUIRY = this.SERVER_URL + "/Inquiry";
   public ATTENDANCE = this.SERVER_URL + "/Attendance"
  public JASPERREPORT = this.SERVER_URL + "/Jasper";

  public CUSTOMER = this.SERVER_URL + "/Customer";



 


}
