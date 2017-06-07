import { Component } from '@angular/core';

@Component({
  selector: 'advertisement-from',
  templateUrl: "./advertisement-form.html",
  // template : "<h2>Hello</h2>"
})
export class AdvertisementFormComponent  {
  title:string = "ABC Advertisements";
  categories:string[] = ["Furniture","Hardware","Mobile"];

  advertisemets:Array<Object> = [];

  addAdvertisement(name:string, category:string, description:string){
    this.advertisemets.push({name,category,description});
    // console.log(this.advertisemets.map(a=> {return a.name}));
  }

}

  // class Advertisement{
  //  name:string;
  //  category:string;
  //  description:string;
  //  constructor(name:string,category:string,description:string) {
  //    this.name = name;
  //    this.category = category;
  //    this.description = description;
  //  }
  // }
