import { Component, Input,EventEmitter } from '@angular/core';
import { AppComponent } from 'D:/Training/Angular2/Code/angular2_day2/src/app/app.component'
@Component({
  selector: 'advertisement-from',
  templateUrl: "./advertisement-form.html",
  outputs: ['childEvent']
})
export class AdvertisementFormComponent  {
  title:string = "ABC Advertisements";
  categories:Array<string> = ["Furniture","Hardware","Mobile"];

  public childEvent= new EventEmitter<Object>();
  addAdvertisement(name: string, category: string, description : string) { 
     this.childEvent.emit({name,category,description});
   }
}