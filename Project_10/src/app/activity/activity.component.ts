import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-activity',
  templateUrl: './activity.component.html',
  styleUrls: ['./activity.component.css']
})
export class ActivityComponent extends BaseCtl{

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
         super(locator.endpoints.ACTIVITY, locator, route);
    }
 
    populateForm(form, data) {
     form.id = data.id;
     form.name = data.name;
     form.performedBy = data.performedBy;
     form.activityTime = data.activityTime;
     form.status = data.status;
     console.log('Populated Form', form);
    }


    parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }
 }
