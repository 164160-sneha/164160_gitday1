import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FlightComponent } from './flight/flight.component';
import { RouterModule, Routes } from '@angular/router';


const appRoutes: Routes = [
  {
    path: 'contact',
    component: FlightComponent,
    data: { title: 'Contact List' }
  },
  { path: '',
    redirectTo: '/flights',
    pathMatch: 'full'
  }
];

@NgModule({
  declarations: [
    AppComponent,
    FlightComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true }
    )
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
