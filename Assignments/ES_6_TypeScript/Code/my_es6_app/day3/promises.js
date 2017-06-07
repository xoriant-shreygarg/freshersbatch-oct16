export function promise1() {
    var p = new Promise(function (resolve, reject) {
        resolve(4);
    });
    var p2 = new Promise(function (resolve, reject) {
        resolve(5);
    });
    Promise.all([p, p2]).then(function (promises) {
        let sum = 0;
        promises.forEach(function (text) { sum += text; console.log(sum); });
    });
}