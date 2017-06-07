interface Printable {
    print: () => void
}
let circle: Printable = {
    print: () => console.log("Circle printed ")
}
let employee: Printable = {
    print: () => console.log("Employee printed ")
}

export function printAll(objects) {
    for(let obj of objects){
        obj.print();
    }
}

export function f2(){
    printAll([circle,employee,circle,employee]);
}
