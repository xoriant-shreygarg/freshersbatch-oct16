import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import {AdvertisementFormComponent} from './components/advertisement-form/adevertisement-form.component';

import {AdvertisementTableComponent} from './components/advertisement-table/adevertisement-table.component';

import {EditProductComponent} from './components/advertisement-edit/adevertisement-edit.component';
@NgModule({
  imports:      [ BrowserModule ],
  declarations: [ AppComponent, AdvertisementFormComponent,AdvertisementTableComponent,EditProductComponent ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
