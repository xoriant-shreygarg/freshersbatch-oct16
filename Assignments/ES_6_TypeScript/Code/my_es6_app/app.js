import "babel-polyfill";

import { const1 } from './components/contants.js'
import { scoping1 } from './components/scoping.js'

import { enhancedObjectProperties1 } from './components/enhancedObjectProperties.js'
import { arrowFunction1 } from './components/arrowFunctions.js'

import { userFriends, printCapitalNames } from './components/extendedParameterHandling.js'
import { templateLiterals1 } from './components/templateLiterals.js'

import { destructuringAssignment1, destructuringAssignment2 } from './components/destructuringAssignment.js'

import { fibonacci } from './day2/symbols.js'
import { Armstrong } from './day2/iterators.js'
import { promise1 } from './day3/promises.js'
import { f1 } from './day3/TypeScriptClasseAndTypes.js'
import { f2 } from './day3/TypeScriptnterfaces.js'
// console.log(const1()); 

// console.log(scoping1()); 

// enhancedObjectProperties1();

// arrowFunction1();

// userFriends("shrey","a","b","c");

// let names = ["a","b","c","d","e"];
// printCapitalNames(...names);

// templateLiterals1();

// let arr = [1,2,3,4];
// destructuringAssignment1(arr);

// destructuringAssignment2();

/*let fb = new fibonacci();
console.log(fb.next());
console.log(fb.next());
console.log(fb.next());
console.log(fb.next());
console.log(fb.next());
console.log(fb.next());
console.log(fb.next());
console.log(fb.next());
console.log(fb.next());*/

/*let fibonacci1 = {
    [Symbol.iterator]() {
        let pre = 0;
        let cur = 1;
        return {
            next() {
                [pre, cur] = [cur, pre + cur];
                return { done: false, value: cur };
            }
        }
    }}
let itr= fibonacci1[Symbol.iterator]();
    console.log("Fibonacci no ", itr.next().value);
    console.log("Fibonacci no ", itr.next().value);
    console.log("Fibonacci no ", itr.next().value);
    console.log("Fibonacci no ", itr.next().value);
    console.log("Fibonacci no ", itr.next().value);
    console.log("Fibonacci no ", itr.next().value);
    console.log("Fibonacci no ", itr.next().value);
    console.log("Fibonacci no ", itr.next().value);
    */


/*let arm2 = {
     [Symbol.iterator]() {
        return {
            next() {
                let n, count = 0, a, b, c, sum = 0;
                for (let i = 100;i<155 ; i++) {
                    n = i;
                    while (n > 0) {
                        b = n % 10;
                        sum = sum + (b * b * b);
                        n = parseInt(n / 10);
                    }
                    if (sum == i) {
                        return i;
                    }
                sum = 0;
                } return -1;
            }
        }
    }
}
let itr = arm2[Symbol.iterator]();
console.log("Armstrong no ", itr.next());
*/

/*let arm1 = new Armstrong();
let itr = arm1[Symbol.iterator]();
console.log("Armstrong no ", itr.next());
console.log("Armstrong no ", itr.next());
console.log("Armstrong no ", itr.next());
console.log("Armstrong no ", itr.next());
console.log("Armstrong no ", itr.next());*/

//promise1();

//f1();

f2();