import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationFormComponent } from './registration-form/registration-form.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { ApplicationDetailsComponent } from './application-details/application-details.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationFormComponent,
    CustomerDetailsComponent,
    ApplicationDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
