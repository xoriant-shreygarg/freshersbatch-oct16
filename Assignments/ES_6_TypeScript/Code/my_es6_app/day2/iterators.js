const mySymbol = Symbol("x");
export class Armstrong {
    
constructor(){
    this[mySymbol] = 100;
}

    [Symbol.iterator]() {
        var temp = this[mySymbol];
        return {
            next() {
                let n, count = 0, a, b, c, sum = 0;
                for (let i = temp;; i++) {
                    n = i;
                    while (n > 0) {
                        b = n % 10;
                        sum = sum + (b * b * b);
                        n = parseInt(n / 10);
                    }
                    //console.log(sum+", "+i);
                    if (sum == i) {
                        //console.log(this[mySymbol]);
                        this[mySymbol] = i;
                        return i;
                    }
                sum = 0;
                }
            }
        }
    }
}