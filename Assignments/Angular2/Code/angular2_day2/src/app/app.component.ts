import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `<advertisement-from  (childEvent)="advertisemets.push($event)"></advertisement-from>
  <advertisement-table [advertisemets]="advertisemets"  (childEvent2)="advertisemets.pop($event)"></advertisement-table>>`
})
export class AppComponent  { 
   public advertisemets:Array<Object> = [];
}
