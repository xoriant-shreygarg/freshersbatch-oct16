
    const prevSymbol = Symbol("prev");
    const currSymbol = Symbol("curr");
    
    export class fibonacci{

    constructor(){
        this[prevSymbol] = 0;
        this[currSymbol] = 1;
    }

    next(){
        let prev = this[prevSymbol];
        let curr = this[currSymbol];
        this[prevSymbol] = curr;
        this[currSymbol] = prev+curr;
        return curr;
    }

}