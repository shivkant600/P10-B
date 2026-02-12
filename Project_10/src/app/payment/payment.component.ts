import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent extends BaseCtl {

    constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
          super(locator.endpoints.PAYMENT, locator, route);
     }
  
     populateForm(form, data) {
      form.id = data.id;
      form.name = data.name;
      form.amount = data.amount;
      form.paymentMode = data.paymentMode;
      form.paymentStatus = data.paymentStatus;
      console.log('Populated Form', form);
     }
  

}
