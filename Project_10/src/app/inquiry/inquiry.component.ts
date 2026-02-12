import { Component, OnInit } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-inquiry',
  templateUrl: './inquiry.component.html',
  styleUrls: ['./inquiry.component.css']
})
export class InquiryComponent extends BaseCtl{

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
          super (locator.endpoints.INQUIRY, locator, route);
       }
    
       populateForm(form, data) {
        form.id = data.id;
        form.inquirerName = data.inquirerName;
        form.email = data.email;
        form.inquirySubject = data.inquirySubject;
        form.inquiryStatus = data.inquiryStatus;
        console.log('Populated Form', form);
       }
  
        parseDate(dateString: string): Date {
      if (dateString) {
        return new Date(dateString);
      }
      return null;
    }
  }
  
