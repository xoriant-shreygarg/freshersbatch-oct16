export function destructuringAssignment1(arr){
    let [,,a,] = arr;
    console.log(a)
}

export function destructuringAssignment2(){
    let organisation = {
        name:"Xoriant Solutions",
        address:{
            floor:"5th",
            building: "Amar paradigm",
            area : "Baner",
            city:"Pune",
            pinCode:32322
        }
    };

let {address:{pinCode}} = organisation;
    console.log(pinCode);
}

