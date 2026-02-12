import { Component, OnInit } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-staff',
  templateUrl: './staff.component.html',
  styleUrls: ['./staff.component.css']
})
export class StaffComponent extends BaseCtl{


   constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
        super(locator.endpoints.STAFF, locator, route);
   }

   populateForm(form, data) {
    form.id = data.id;
    form.name = data.name;
    form.joiningDate = data.joiningDate;
    form.division = data.division;
    form.previousEmployer = data.previousEmployer;
    console.log('Populated Form', form);
   }

   parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }
   

}
