import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-stafflist',
  templateUrl: './stafflist.component.html',
  styleUrls: ['./stafflist.component.css']
})
export class StafflistComponent  extends BaseListCtl implements OnInit {

 constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
     super(locator.endpoints.STAFF, locator, route);
   }
 

}
