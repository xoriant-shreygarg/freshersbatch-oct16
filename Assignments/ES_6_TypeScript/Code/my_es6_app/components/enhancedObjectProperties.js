export function enhancedObjectProperties1(){
    let order = {
        id:100,
        title:"ABC",
        price:5000,
    printOrder(){
        console.log("ID : "+this.id+"\nTitle : "+this.title+"\nPrice : "+this.price);
    },
    getPrice(){
        return this.price;
    }
}
    // order.printOrder();
    // console.log(order.getPrice());

let order2 = {};
    Object.assign(order2,order);
    order2.printOrder();
}