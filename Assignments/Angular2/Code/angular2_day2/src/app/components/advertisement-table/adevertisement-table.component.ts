import { Component,EventEmitter } from '@angular/core';

@Component({
  selector: 'advertisement-table',
  templateUrl: './advertisement-table.html',
  inputs: ['advertisemets'],
  outputs :['childEvent2']
})
export class AdvertisementTableComponent  {
   public advertisemets:Array<Object>;

public childEvent2= new EventEmitter<Object>();
   deleteAdvertisement(name: string, category: string, description : string){
      this.childEvent2.emit({name,category,description});
   }
}