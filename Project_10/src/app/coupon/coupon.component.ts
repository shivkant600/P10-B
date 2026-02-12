import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-coupon',
  templateUrl: './coupon.component.html',
  styleUrls: ['./coupon.component.css']
})
export class CouponComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
          super(locator.endpoints.COUPON, locator, route);
     }
  
     populateForm(form, data) {
      form.id = data.id;
      form.offerCode = data.offerCode;
      form.discountAmount = data.discountAmount;
      form.expireDate = data.expireDate;
      form.offerStatus = data.offerStatus;
      console.log('Populated Form', form);
     }

}
