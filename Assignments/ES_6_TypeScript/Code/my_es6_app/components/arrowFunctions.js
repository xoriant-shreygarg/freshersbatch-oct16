export function arrowFunction1(){
    let arr = ["Shrey", "Shubham", "Nishant", "Archit"];
    let arr2 = arr.map(name => {return {'name':name,'length':name.length}});
    console.log(arr2.map(a=> {return a.name+" : "+a.length}));
}