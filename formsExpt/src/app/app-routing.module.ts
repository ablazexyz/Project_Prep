import { LoginPageComponent } from './login-page/login-page.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ApplicationDetailsComponent } from './application-details/application-details.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { RegistrationFormComponent } from './registration-form/registration-form.component';

const routes: Routes = [
  { path: 'register', component: RegistrationFormComponent },
  { path: 'customer-details', component: CustomerDetailsComponent },
  { path: 'application-details', component: ApplicationDetailsComponent },
  { path: 'login', component: LoginPageComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
